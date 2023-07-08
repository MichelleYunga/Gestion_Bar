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

import com.example.demo.models.entity.Pedido;
import com.example.demo.models.services.IPedidoService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class PedidoRestController {


	@Autowired
	private IPedidoService pedidoService;
	
	/*LISTAR*/
	@GetMapping ("/pedido")
	public List<Pedido> index(){
		return pedidoService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/pedido/{id}")
	public Pedido show(@PathVariable Long id) {
		return pedidoService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/pedido")
	@ResponseStatus (HttpStatus.CREATED)
	public Pedido create(@RequestBody  Pedido pedido ) {
		return pedidoService.save(pedido);
	}
	
	/*EDITAR*/
	@PutMapping ("/pedido/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Pedido update(@RequestBody Pedido pedido,@PathVariable Long id) {
		Pedido ped = pedidoService.findById(id);
		ped.setPedid_descripcion(pedido.getPedid_descripcion());
		ped.setPedid_estado(pedido.getPedid_estado());
		ped.setPed_fecha(pedido.getPed_fecha());
		ped.setPedid_cantidad(pedido.getPedid_cantidad());
		return pedidoService.save(ped);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/pedido/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		pedidoService.delete(id);
	}
}
