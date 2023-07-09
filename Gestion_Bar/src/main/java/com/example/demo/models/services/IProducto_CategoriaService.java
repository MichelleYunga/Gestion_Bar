package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.Categoria;


public interface IProducto_CategoriaService {
	
public List<Categoria> findAll();
	
	public Categoria save(Categoria categoria);
	
	public Categoria findById(long id);
	
	public void delete (long id);

}
