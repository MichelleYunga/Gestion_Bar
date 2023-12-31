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

import com.example.demo.models.entity.Producto;
import com.example.demo.models.services.IProductoService;

@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class ProductoRestController {

	
	@Autowired
	private IProductoService productoService;
	
	/*LISTAR*/
	@GetMapping ("/listar")
	public List<Producto> index(){
		return productoService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/agregar/{id}")
	public Producto show(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/agregar")
	@ResponseStatus (HttpStatus.CREATED)
	public Producto create(@RequestBody  Producto producto ) {
		return productoService.save(producto);
	}
	
	/*EDITAR*/
	@PutMapping ("/actualizar/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Producto update(@RequestBody Producto producto,@PathVariable Long id) {
		Producto prod = productoService.findById(id);
		prod.setProd_cantidad(producto.getProd_cantidad());
		prod.setProd_codigo(producto.getProd_codigo());
		prod.setProd_descripcion(producto.getProd_descripcion());
		prod.setPrecio(producto.getPrecio());
		prod.setProd_img(producto.getProd_img());
		return productoService.save(prod);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		productoService.delete(id);
	}
}
