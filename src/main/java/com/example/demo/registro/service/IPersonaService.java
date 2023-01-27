package com.example.demo.registro.service;

import com.example.demo.registro.modelo.Persona;

public interface IPersonaService {
	public void insertar(Persona persona);

	public void actualizar(Persona persona);

	public Persona buscar(Integer id);
	
	public void borrar (Integer id);

}
