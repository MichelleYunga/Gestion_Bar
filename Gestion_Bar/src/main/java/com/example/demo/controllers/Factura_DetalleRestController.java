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

import com.example.demo.models.entity.FacturaDetalle;
import com.example.demo.models.services.IFactura_DetalleService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class Factura_DetalleRestController {
	
	@Autowired
	private IFactura_DetalleService facService;
	
	/*LISTAR*/
	@GetMapping ("/facturadetalle")
	public List<FacturaDetalle> index(){
		return facService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/facturadetalle/{id}")
	public FacturaDetalle show(@PathVariable Long id) {
		return facService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/facturadetalle")
	@ResponseStatus (HttpStatus.CREATED)
	public FacturaDetalle create(@RequestBody  FacturaDetalle facturaDetalle ) {
		return facService.save(facturaDetalle);
	}
	
	/*EDITAR*/
	@PutMapping ("/facturadetalle/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public FacturaDetalle update(@RequestBody FacturaDetalle facturaDetalle,@PathVariable Long id) {
		FacturaDetalle fac = facService.findById(id);
		fac.setTotal(facturaDetalle.getTotal());
		return facService.save(fac);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/facturadetalle/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		facService.delete(id);
	}

}
