package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

@Entity 
@Table(name= "personas", uniqueConstraints = {@UniqueConstraint(columnNames ={"cedula"})})
public class Persona implements  Serializable{
	
	private static final long serialVersionUID = 1L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_persona;
	private String cedula;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String direccion;
	private String fechanacimiento;


	// RELACIONES
		@OneToMany(mappedBy="persona", cascade = CascadeType.ALL)
		private List<Administrador> administrador;
	
		
		
		@OneToMany(mappedBy="persona", cascade = CascadeType.ALL)
		private List<Cliente> cliente;
		
	//
	public Long getId_persona() {
		return id_persona;
	}

	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	
	
	
	
	

}
