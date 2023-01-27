package com.example.demo.registro.repo;

import com.example.demo.registro.modelo.Persona;
import com.example.demo.registro.modelo.Vehiculo;

public interface IPersonaRepo {
	
	
	public void insertar(Persona persona);

	public void actualizar(Persona persona);

	public Persona buscar(Integer id);
	
	public void borrar (Integer id);
	


}
