package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.FacturaDetalle;


public interface IFactura_DetalleService {
	
	
public List<FacturaDetalle> findAll();
	
	public FacturaDetalle save(FacturaDetalle factura_detalle);
	
	public FacturaDetalle findById(long id);
	
	public void delete (long id);
}
