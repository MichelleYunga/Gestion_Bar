package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.FacturaDetalle;

public interface IFacturaDetalleService {


public List<FacturaDetalle> findAll();
	
	public FacturaDetalle save(FacturaDetalle facDetalle);
	
	public FacturaDetalle findById(long id);
	
	public void delete (long id);
}
