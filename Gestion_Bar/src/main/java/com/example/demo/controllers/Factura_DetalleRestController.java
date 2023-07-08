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

import com.example.demo.models.entity.Factura_Detalle;
import com.example.demo.models.services.IFactura_DetalleService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class Factura_DetalleRestController {
	
	@Autowired
	private IFactura_DetalleService facService;
	
	/*LISTAR*/
	@GetMapping ("/facturadetalle")
	public List<Factura_Detalle> index(){
		return facService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/facturadetalle/{id}")
	public Factura_Detalle show(@PathVariable Long id) {
		return facService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/facturadetalle")
	@ResponseStatus (HttpStatus.CREATED)
	public Factura_Detalle create(@RequestBody  Factura_Detalle factura_Detalle ) {
		return facService.save(factura_Detalle);
	}
	
	/*EDITAR*/
	@PutMapping ("/facturadetalle/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Factura_Detalle update(@RequestBody Factura_Detalle factura_Detalle,@PathVariable Long id) {
		Factura_Detalle fac = facService.findById(id);
		fac.setTotal(factura_Detalle.getTotal());
		return facService.save(fac);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/facturadetalle/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		facService.delete(id);
	}

}
