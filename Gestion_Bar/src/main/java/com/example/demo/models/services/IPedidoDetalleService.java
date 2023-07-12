package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.PedidoDetalle;

public interface IPedidoDetalleService {
	
public List<PedidoDetalle> findAll();
	
	public PedidoDetalle save(PedidoDetalle pedDetalle);
	
	public PedidoDetalle findById(long id);
	
	public void delete (long id);
	
}
