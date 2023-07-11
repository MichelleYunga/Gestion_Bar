package com.example.demo.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name= "administradores", uniqueConstraints = {@UniqueConstraint(columnNames ={"cedula"})})
public class Administrador implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_administrador;
	private String cedula;
	private String usuario;
	private String contrase;
	
	
	
	
	
	//RELACIONES
		@ManyToOne
		@JoinColumn(name = "id_persona")
		private Persona persona;

		

	//
	
	public Long getId_administrador() {
		return id_administrador;
	}
	public void setId_administrador(Long id_administrador) {
		this.id_administrador = id_administrador;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrase() {
		return contrase;
	}
	public void setContrase(String contrase) {
		this.contrase = contrase;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	public Administrador() {
		super();
	}
	public Administrador(Long id_administrador, String usuario, String contrase) {
		super();
		this.id_administrador = id_administrador;
		this.usuario = usuario;
		this.contrase = contrase;
	}
	
	
	
	
	

}
