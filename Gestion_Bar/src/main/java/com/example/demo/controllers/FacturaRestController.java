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

import com.example.demo.models.entity.Factura;
import com.example.demo.models.services.IFacturaService;


@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class FacturaRestController {
	
	@Autowired
	private IFacturaService faService;
	
	/*LISTAR*/
	@GetMapping ("/factura")
	public List<Factura> index(){
		return faService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/factura/{id}")
	public Factura show(@PathVariable Long id) {
		return faService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/factura")
	@ResponseStatus (HttpStatus.CREATED)
	public Factura create(@RequestBody  Factura factura ) {
		return faService.save(factura);
	}
	
	/*EDITAR*/
	@PutMapping ("/factura/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Factura update(@RequestBody Factura factura,@PathVariable Long id) {
		Factura fac = faService.findById(id);
		fac.setId_cliente(factura.getId_cliente());
		fac.setId_pedido_detalle(factura.getId_pedido_detalle());
		fac.setEstado(factura.getEstado());
		return faService.save(fac);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/factura/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		faService.delete(id);
	}
	

}
