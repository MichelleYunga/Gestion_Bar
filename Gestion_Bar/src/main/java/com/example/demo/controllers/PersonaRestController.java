package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.Persona;
import com.example.demo.models.services.IPersonaService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class PersonaRestController {
	
	@Autowired
	private IPersonaService personaService;
	
	
	/*LISTAR*/
	@GetMapping ("/persona")
	public List<Persona> index(){
		return personaService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/persona/{id}")
	public Persona show(@PathVariable Long id) {
		return personaService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/persona")
	@ResponseStatus (HttpStatus.CREATED)
	public Persona create(@RequestBody  Persona persona ) {
		return personaService.save(persona);
	}
	
	/*EDITAR*/
	@PutMapping ("/persona/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Persona update(@RequestBody Persona persona,@PathVariable Long id) {
		Persona per = personaService.findById(id);
		per.setCedula(persona.getCedula());
		per.setNombre(persona.getNombre());
		per.setApellido(persona.getApellido());
		per.setTelefono(persona.getTelefono());
		per.setCorreo(persona.getCorreo());
		per.setDireccion(persona.getDireccion());
		return personaService.save(per);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/persona/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		personaService.delete(id);
	}
}
