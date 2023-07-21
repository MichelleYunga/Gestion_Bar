package com.example.demo.models.dao;


<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82
=======

>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82
=======

>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82
import org.springframework.data.repository.CrudRepository;


import com.example.demo.models.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona, Long> {
	

	Persona findByCedula(String cedula);
	

}
