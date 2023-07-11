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
	private Long id_persona;
	private String usuario;
	private String contrase;
	
	
	//RELACIONES
		@ManyToOne
		@JoinColumn(name = "id_persona")
		

	//
	
	public Long getId_administrador() {
		return id_administrador;
	}
	public void setId_administrador(Long id_administrador) {
		this.id_administrador = id_administrador;
	}
	
	public Long getId_persona() {
		return id_persona;
	}
	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
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
	
	
	
	
	

}
