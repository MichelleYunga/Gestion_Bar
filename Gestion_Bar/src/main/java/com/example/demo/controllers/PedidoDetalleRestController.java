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

import com.example.demo.models.entity.PedidoDetalle;
import com.example.demo.models.services.IPedidoDetalleService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class PedidoDetalleRestController {


	@Autowired
	private IPedidoDetalleService  pedidodetalleService;
	
	/*LISTAR*/
	@GetMapping ("/pedidoD")
	public List<PedidoDetalle> index(){
		return pedidodetalleService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/pedidoD/{id}")
	public PedidoDetalle show(@PathVariable Long id) {
		return pedidodetalleService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/pedidoD")
	@ResponseStatus (HttpStatus.CREATED)
	public PedidoDetalle create(@RequestBody  PedidoDetalle pedidodetalle ) {
		return pedidodetalleService.save(pedidodetalle);
	}
	

	/*EDITAR*/
	@PutMapping ("/pedidoD/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public PedidoDetalle update(@RequestBody PedidoDetalle pediddetalle,@PathVariable Long id) {
		PedidoDetalle pedidoC = pedidodetalleService.findById(id);
		pedidoC.setCantidad(pediddetalle.getCantidad());
		pedidoC.setTotal(pediddetalle.getTotal());
		pedidoC.setProducto(pediddetalle.getProducto());
			return pedidodetalleService.save(pedidoC);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/pedidoD/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		pedidodetalleService.delete(id);
	}
}
