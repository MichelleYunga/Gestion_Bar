package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.ClienteRepository;
import com.example.demo.models.dao.IPersonaDao;
import com.example.demo.models.dao.PersonaRepository;
import com.example.demo.models.entity.Persona;

@Service
public class PersonaServicelmpl implements IPersonaService{
	
	@Autowired
	private IPersonaDao personaDao;
	private  final PersonaRepository personaRepository;
	private  final ClienteRepository clienteRepository;
	
	
	@Autowired
	public PersonaServicelmpl (PersonaRepository personaRepository, ClienteRepository clienteRepository) {
		this.personaRepository = personaRepository;
		this.clienteRepository = clienteRepository;
	}

	@Override
	@Transactional (readOnly = true)
	public List<Persona> findAll() {
		return (List<Persona>) personaDao.findAll();
	}

	@Override
	@Transactional
	public Persona save(Persona persona) {
		return personaDao.save(persona);
	}

	@Override
	@Transactional (readOnly = true)
	public Persona findById(long id) {
		return personaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		personaDao.deleteById(id);
	}

	@Override
<<<<<<< HEAD
<<<<<<< HEAD
	@Transactional (readOnly = true)
	public List<Persona> ObtenerDatos() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

=======
=======
>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82
	@Transactional(readOnly = true)
	public Persona findByCedula(String cedula) {
		// TODO Auto-generated method stub
		return personaDao.findByCedula(cedula);
	}
<<<<<<< HEAD
>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82
=======
>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82
	

	
	
	
	
	

}
