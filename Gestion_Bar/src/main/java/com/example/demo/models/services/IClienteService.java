package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.Cliente;



public interface IClienteService {
	
public List<Cliente> findAll();
	
	public Cliente save(Cliente cliente);
	
	public Cliente findById(long id);
	
	public void delete (long id);
	
	
	
	
	

}
