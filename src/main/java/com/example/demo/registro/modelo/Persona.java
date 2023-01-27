package com.example.demo.registro.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_sec")//generarlo como secuencia
	@SequenceGenerator(name = "person_sec", sequenceName = "person_sec", allocationSize = 1)
	@Column(name = "person_id")
	private Integer id;
	
	@Column(name = "person_nombre")
	private String nombre;
	
	@Column(name = "person_apellido")
	private String apellido;
	
	@Column(name = "person_cedula")
	private String cedula;
	
	@OneToMany(mappedBy ="persona", cascade = CascadeType.ALL, fetch =  FetchType.LAZY )
	private List <Vehiculo> vehiculos;
	
	//get& set

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(List<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", vehiculos=" + vehiculos + "]";
	} 
	
	
	

}
