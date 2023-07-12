package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.FacturaDetalle;
import com.example.demo.models.services.IFacturaDetalleService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class FacturaDetalleRestController {

	@Autowired
	private IFacturaDetalleService  facturadetalleService;
	
	/*LISTAR*/
	@GetMapping ("/facturaD")
	public List<FacturaDetalle> index(){
		return facturadetalleService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/facturaD/{id}")
	public FacturaDetalle show(@PathVariable Long id) {
		return facturadetalleService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/facturaD")
	@ResponseStatus (HttpStatus.CREATED)
	public FacturaDetalle create(@RequestBody  FacturaDetalle facturaDetalle ) {
		return facturadetalleService.save(facturaDetalle);
	}

	
	/*ELIMINAR*/
	@DeleteMapping ("/facturaD/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		facturadetalleService.delete(id);
	}
}
