package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.Producto_Categoria;


public interface IProducto_CategoriaService {
	
public List<Producto_Categoria> findAll();
	
	public Producto_Categoria save(Producto_Categoria producto_Categoria);
	
	public Producto_Categoria findById(long id);
	
	public void delete (long id);

}
