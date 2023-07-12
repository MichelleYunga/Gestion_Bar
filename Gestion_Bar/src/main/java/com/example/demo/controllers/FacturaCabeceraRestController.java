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

import com.example.demo.models.entity.FacturaCabecera;
import com.example.demo.models.services.IFacturaCabeceraService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class FacturaCabeceraRestController {


	@Autowired
	private IFacturaCabeceraService  facturacabeceraService;
	
	/*LISTAR*/
	@GetMapping ("/facturaC")
	public List<FacturaCabecera> index(){
		return facturacabeceraService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/facturaC/{id}")
	public FacturaCabecera show(@PathVariable Long id) {
		return facturacabeceraService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/facturaC")
	@ResponseStatus (HttpStatus.CREATED)
	public FacturaCabecera create(@RequestBody  FacturaCabecera facturaCabecera ) {
		return facturacabeceraService.save(facturaCabecera);
	}

	
	/*ELIMINAR*/
	@DeleteMapping ("/facturaC/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		facturacabeceraService.delete(id);
	}
	
}
