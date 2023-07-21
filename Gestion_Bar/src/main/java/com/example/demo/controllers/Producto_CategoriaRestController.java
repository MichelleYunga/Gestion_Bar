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

import com.example.demo.models.entity.Categoria;
import com.example.demo.models.services.IProducto_CategoriaService;


@CrossOrigin(origins = { "http://localhost:4200/" })
@RestController
@RequestMapping("/categorias")
public class Producto_CategoriaRestController {
	
	
	@Autowired
	private IProducto_CategoriaService categoriaService;
	
	
	/*LISTAR*/
	@GetMapping ("/listar")
	public List<Categoria> index(){
		return categoriaService.findAll();
	}
	
	/*BUSCAR ID*/
	@GetMapping ("/Buscar/{id}")
	public Categoria show(@PathVariable Long id) {
		return categoriaService.findById(id);
	}
	
	/*GUARDAR*/
	@PostMapping("/agregar")
	@ResponseStatus (HttpStatus.CREATED)
	public Categoria create(@RequestBody Categoria categoria ) {
		return categoriaService.save(categoria);
	}
	
	/*EDITAR*/
	@PutMapping ("/actualizar/{id}")
	@ResponseStatus (HttpStatus.CREATED)
	public Categoria update(@RequestBody Categoria categoria,@PathVariable Long id) {
		Categoria proc = categoriaService.findById(id);
		proc.setNombre(categoria.getNombre());
		proc.setTipo(categoria.getTipo());
		return categoriaService.save(proc);	
	}
	
	/*ELIMINAR*/
	@DeleteMapping ("/eliminar/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		categoriaService.delete(id);
	}
	
	

}
