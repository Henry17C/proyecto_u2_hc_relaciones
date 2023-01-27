package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.registro.modelo.Persona;
import com.example.demo.registro.modelo.Vehiculo;
import com.example.demo.registro.service.IPersonaService;
import com.example.demo.registro.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU2T10Application implements CommandLineRunner {
	
	@Autowired 
	private IPersonaService iPersonaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2T10Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Persona persona= new Persona();
		persona.setApellido("Gomez");
		persona.setNombre("Menany");
		persona.setCedula("175553");
		
		Vehiculo vehiculo= new Vehiculo();
		vehiculo.setMarca("Honda");
		vehiculo.setPlaca("NFS145");
		vehiculo.setPersona(persona);
		
		Vehiculo vehiculo2= new Vehiculo();
		vehiculo2.setMarca("Toyota");
		vehiculo2.setPlaca("NFS145");
		
		
		
		List <Vehiculo> listVehi= new ArrayList<>();
		listVehi.add(vehiculo2);
		listVehi.add(vehiculo);
		
		vehiculo2.setPersona(persona);
		vehiculo.setPersona(persona);
		persona.setVehiculos(listVehi);
	
		iPersonaService.insertar(persona);
		Persona person= iPersonaService.buscar(1);
		person.setCedula("11000");
		iPersonaService.actualizar(persona);
		iPersonaService.borrar(1);
		
		
	}

}
