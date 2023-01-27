package com.example.demo.registro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.registro.modelo.Persona;
import com.example.demo.registro.repo.IPersonaRepo;
@Service
public class PersonaServiceImpl implements IPersonaService{

	
	
	@Autowired
	private IPersonaRepo iPersonaRepo;
	
	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		iPersonaRepo.insertar(persona);
		
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		iPersonaRepo.actualizar(persona);
	}

	@Override
	public Persona buscar(Integer id) {
		// TODO Auto-generated method stub
		return iPersonaRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		iPersonaRepo.borrar(id);
		
	}

}
