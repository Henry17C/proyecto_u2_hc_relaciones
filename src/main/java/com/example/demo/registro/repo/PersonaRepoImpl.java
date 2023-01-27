package com.example.demo.registro.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.registro.modelo.Persona;
import com.example.demo.registro.modelo.Vehiculo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class PersonaRepoImpl implements IPersonaRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Persona persona) {
		// TODO Auto-generated method stub
		entityManager.persist(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		entityManager.merge(persona);
	}

	@Override
	public Persona buscar(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Persona.class, id);
	}

	@Override
	public void borrar(Integer id) {
		Persona persona= this.buscar(id);
		entityManager.remove(persona);
		
	}

}
