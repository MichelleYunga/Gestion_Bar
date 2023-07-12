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

import com.example.demo.models.entity.PedidoCabecera;
import com.example.demo.models.services.IPedidoCabeceraService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class PedidoCabeceraRestController {

	@Autowired
	private IPedidoCabeceraService  pedidocabeceraService;
	
	/*LISTAR*/
	@GetMapping ("/pedidoC")
	public List<PedidoCabecera> index(){
		return pedidocabeceraService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/pedidoC/{id}")
	public PedidoCabecera show(@PathVariable Long id) {
		return pedidocabeceraService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/pedidoC")
	@ResponseStatus (HttpStatus.CREATED)
	public PedidoCabecera create(@RequestBody  PedidoCabecera pedidocabecera ) {
		return pedidocabeceraService.save(pedidocabecera);
	}
	

	/*EDITAR*/
	@PutMapping ("/pedidoC/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public PedidoCabecera update(@RequestBody PedidoCabecera pedidCabecera,@PathVariable Long id) {
		PedidoCabecera pedidoC = pedidocabeceraService.findById(id);
		pedidoC.setPedid_estado(pedidCabecera.getPedid_estado());
		pedidoC.setPed_fecha(pedidCabecera.getPed_fecha());
			return pedidocabeceraService.save(pedidoC);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/pedidoC/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		pedidocabeceraService.delete(id);
	}
	
}
