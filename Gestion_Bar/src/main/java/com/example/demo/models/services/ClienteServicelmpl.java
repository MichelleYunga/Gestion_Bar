package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.demo.models.dao.IClienteDao;
import com.example.demo.models.entity.Cliente;



@Service
public class ClienteServicelmpl implements IClienteService {
	
	@Autowired
	private IClienteDao clienteDao;
	

	@Override
	@Transactional (readOnly = true)
	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional (readOnly = true)
	public Cliente findById(long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		clienteDao.deleteById(id);
	}

	

	  

	
	


	

	
	

}
