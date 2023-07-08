package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.Pedido;

public interface IPedidoService {
	
	public List<Pedido> findAll();

	public Pedido save(Pedido pedido);

	public Pedido findById(long id);

	public void delete(long id);
}
