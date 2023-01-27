package com.example.demo.registro.repo;

import com.example.demo.registro.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	
	public void insertar(Vehiculo vehiculo);

	public void actualizar(Vehiculo vehiculo);

	public Vehiculo buscar(Integer id);
	
	public void borrar (Integer id);
	

}
