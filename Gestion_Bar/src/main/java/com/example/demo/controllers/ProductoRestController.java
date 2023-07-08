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

import com.example.demo.models.entity.Productos;
import com.example.demo.models.services.IProductoService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class ProductoRestController {

	
	@Autowired
	private IProductoService productoService;
	
	/*LISTAR*/
	@GetMapping ("/producto")
	public List<Productos> index(){
		return productoService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/producto/{id}")
	public Productos show(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/protucto")
	@ResponseStatus (HttpStatus.CREATED)
	public Productos create(@RequestBody  Productos producto ) {
		return productoService.save(producto);
	}
	
	/*EDITAR*/
	@PutMapping ("/producto/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Productos update(@RequestBody Productos producto,@PathVariable Long id) {
		Productos prod = productoService.findById(id);
		prod.setProd_cantidad(producto.getProd_cantidad());
		prod.setProd_descripción(producto.getProd_descripción());
		prod.setProd_img(producto.getProd_img());
		return productoService.save(prod);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/producto/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		productoService.delete(id);
	}
}
