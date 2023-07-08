package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.Productos;

public interface IProductoService {
public List<Productos> findAll();
	
	public Productos save(Productos producto);
	
	public Productos findById(long id);
	
	public void delete (long id);

}
