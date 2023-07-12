package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IPedidoDetalleDao;
import com.example.demo.models.entity.PedidoDetalle;

@Service
public class PedidoDetalleServicelmpl  implements IPedidoDetalleService {

	@Autowired
	private IPedidoDetalleDao pedidodetalleDao;

	@Override
	@Transactional (readOnly = true)
	public List<PedidoDetalle> findAll() {
		return (List<PedidoDetalle>) pedidodetalleDao.findAll();
	}

	@Override
	@Transactional
	public PedidoDetalle save(PedidoDetalle pedidodetalle) {
		return pedidodetalleDao.save(pedidodetalle);
	}

	@Override
	@Transactional (readOnly = true)
	public PedidoDetalle findById(long id) {
		return pedidodetalleDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		pedidodetalleDao.deleteById(id);
	}


}
