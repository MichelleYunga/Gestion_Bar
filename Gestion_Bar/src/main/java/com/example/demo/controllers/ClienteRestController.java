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

import com.example.demo.models.entity.Cliente;
import com.example.demo.models.services.IClienteService;


@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	/*LISTAR*/
	@GetMapping ("/cliente")
	public List<Cliente> index(){
		return clienteService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/cliente/{id}")
	public Cliente show(@PathVariable Long id) {
		return clienteService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/cliente")
	@ResponseStatus (HttpStatus.CREATED)
	public Cliente create(@RequestBody  Cliente cliente ) {
		return clienteService.save(cliente);
	}
	
	/*EDITAR*/
	@PutMapping ("/cliente/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente,@PathVariable Long id) {
		Cliente cli = clienteService.findById(id);
		cli.setUsuario(cliente.getUsuario());
		cli.setContraseña(cliente.getContraseña());
		return clienteService.save(cli);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/cliente/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);
	}
	

}
