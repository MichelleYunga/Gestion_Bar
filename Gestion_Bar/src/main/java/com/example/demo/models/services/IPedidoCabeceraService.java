package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.PedidoCabecera;

public interface IPedidoCabeceraService {

public List<PedidoCabecera> findAll();
	
	public PedidoCabecera save(PedidoCabecera pedidCabecera);
	
	public PedidoCabecera findById(long id);
	
	public void delete (long id);

	
	

}
