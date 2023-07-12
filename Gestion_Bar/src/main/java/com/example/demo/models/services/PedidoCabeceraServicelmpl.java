package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IPedidoCabeceraDao;
import com.example.demo.models.entity.PedidoCabecera;

@Service
public class PedidoCabeceraServicelmpl implements IPedidoCabeceraService {


	@Autowired
	private IPedidoCabeceraDao pedidocabeceraDao;

	@Override
	@Transactional (readOnly = true)
	public List<PedidoCabecera> findAll() {
		return (List<PedidoCabecera>) pedidocabeceraDao.findAll();
	}

	@Override
	@Transactional
	public PedidoCabecera save(PedidoCabecera pedidocabecera) {
		return pedidocabeceraDao.save(pedidocabecera);
	}

	@Override
	@Transactional (readOnly = true)
	public PedidoCabecera findById(long id) {
		return pedidocabeceraDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		pedidocabeceraDao.deleteById(id);
	}

	
	
}
