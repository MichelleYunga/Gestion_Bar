package com.example.demo.models.services;

import java.util.List;


import com.example.demo.models.entity.Persona;

public interface IPersonaService {
	
public List<Persona> findAll();
	
	public Persona save(Persona persona);
	
	public Persona findById(long id);
	
	public void delete (long id);
	
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	public List<Persona> ObtenerDatos();
=======
	public Persona findByCedula (String cedula); 
>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82
=======
	public Persona findByCedula (String cedula); 
>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82
=======
	public Persona findByCedula (String cedula); 
>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82

}
