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

import com.example.demo.models.entity.Producto_Categoria;
import com.example.demo.models.services.IProducto_CategoriaService;


@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/api")
public class Producto_CategoriaRestController {
	
	
	@Autowired
	private IProducto_CategoriaService categoriaService;
	
	
	/*LISTAR*/
	@GetMapping ("/productocategoria")
	public List<Producto_Categoria> index(){
		return categoriaService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/productocategoria/{id}")
	public Producto_Categoria show(@PathVariable Long id) {
		return categoriaService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/productocategoria")
	@ResponseStatus (HttpStatus.CREATED)
	public Producto_Categoria create(@RequestBody Producto_Categoria producto_Categoria ) {
		return categoriaService.save(producto_Categoria);
	}
	
	/*EDITAR*/
	@PutMapping ("/productocategoria/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Producto_Categoria update(@RequestBody Producto_Categoria producto_Categoria,@PathVariable Long id) {
		Producto_Categoria proc = categoriaService.findById(id);
		proc.setNombre(producto_Categoria.getNombre());
		proc.setTipo(producto_Categoria.getTipo());
		return categoriaService.save(proc);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/productocategoria/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		categoriaService.delete(id);
	}
	
	

}
