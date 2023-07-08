package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.Administrador;

public interface IAdministradorService {
	
public List<Administrador> findAll();
	
	public Administrador save(Administrador admin);
	
	public Administrador findById(long id);
	
	public void delete (long id);

}
