package com.example.demo.models.services;

import java.util.List;


import com.example.demo.models.entity.Persona;

public interface IPersonaService {
	
public List<Persona> findAll();
	
	public Persona save(Persona persona);
	
	public Persona findById(long id);
	
	public void delete (long id);
	

	public List<Persona> ObtenerDatos();
	public Persona findByCedula (String cedula); 

	 


}
