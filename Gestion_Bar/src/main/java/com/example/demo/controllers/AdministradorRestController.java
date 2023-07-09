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

import com.example.demo.models.entity.Administrador;
import com.example.demo.models.services.IAdministradorService;


@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class AdministradorRestController {
	
	@Autowired
	private IAdministradorService  administradorService;
	
	/*LISTAR*/
	@GetMapping ("/administrador")
	public List<Administrador> index(){
		return administradorService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/administrador/{id}")
	public Administrador show(@PathVariable Long id) {
		return administradorService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/administrador")
	@ResponseStatus (HttpStatus.CREATED)
	public Administrador create(@RequestBody  Administrador administrador ) {
		return administradorService.save(administrador);
	}
	
	/*EDITAR*/
	@PutMapping ("/administrador/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Administrador update(@RequestBody Administrador administrador,@PathVariable Long id) {
		Administrador admin = administradorService.findById(id);
		admin.setUsuario(administrador.getUsuario());
		admin.setContrase(administrador.getContrase());
		return administradorService.save(admin);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/administrador/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		administradorService.delete(id);
	}
	

}
