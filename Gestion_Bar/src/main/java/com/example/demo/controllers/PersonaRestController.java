package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import com.example.demo.models.dao.ClienteRepository;
import com.example.demo.models.dao.PersonaRepository;
import com.example.demo.models.entity.Persona;
import com.example.demo.models.services.IPersonaService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class PersonaRestController {
	
	@Autowired
	private IPersonaService personaService;
	private  final PersonaRepository personaRepository;
	private  final ClienteRepository clienteRepository;
	
	
	@Autowired
	public PersonaRestController (PersonaRepository personaRepository, ClienteRepository clienteRepository) {
		this.personaRepository = personaRepository;
		this.clienteRepository = clienteRepository;
	}
	
	
	
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
		System.out.println(persona.getCedula()+"1234");
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
		per.setFechanacimiento(persona.getFechanacimiento());
		return personaService.save(per);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/persona/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		personaService.delete(id);
	}
	
<<<<<<< HEAD
<<<<<<< HEAD
	
	@GetMapping("/datos-relacionados")
    public ResponseEntity<List<Persona>>  obtenerDatosRelacionados() {
        List<Persona> datosRelacionados = personaRepository.findAll();
        return ResponseEntity.ok(datosRelacionados);
    }
=======
=======
>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82
	//METODO PERSONALIZADO 
	
	@GetMapping("/personaced/{cedula}")
	public Persona show2(@PathVariable String cedula) {
		return personaService.findByCedula(cedula);
	}
<<<<<<< HEAD
>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82
=======
>>>>>>> c6854097bf79d0a4ed8db5ec8a6e2ff532866d82
}
