package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IPedidoDao;
import com.example.demo.models.entity.Pedido;

@Service
public class PedidoServicelmpl implements IPedidoService{

	

	@Autowired
	private IPedidoDao pedidoDao;

	@Override
	@Transactional (readOnly = true)
	public List<Pedido> findAll() {
		return (List<Pedido>) pedidoDao.findAll();
	}

	@Override
	@Transactional
	public Pedido save(Pedido pedido) {
		return pedidoDao.save(pedido);
	}

	@Override
	@Transactional (readOnly = true)
	public Pedido findById(long id) {
		return pedidoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		pedidoDao.deleteById(id);
	}
}
