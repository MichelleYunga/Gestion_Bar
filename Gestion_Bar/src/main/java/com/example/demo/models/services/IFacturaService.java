package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.Factura;


public interface IFacturaService {
	
public List<Factura> findAll();
	
	public Factura save(Factura factura);
	
	public Factura findById(long id);
	
	public void delete (long id);

}
