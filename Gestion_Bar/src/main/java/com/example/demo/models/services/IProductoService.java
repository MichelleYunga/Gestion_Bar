package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.Producto;

public interface IProductoService {
public List<Producto> findAll();
	
	public Producto save(Producto producto);
	
	public Producto findById(long id);
	
	public void delete (long id);

}
