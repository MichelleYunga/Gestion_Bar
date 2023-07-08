package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.Factura_Detalle;


public interface IFactura_DetalleService {
	
	
public List<Factura_Detalle> findAll();
	
	public Factura_Detalle save(Factura_Detalle factura_detalle);
	
	public Factura_Detalle findById(long id);
	
	public void delete (long id);
}
