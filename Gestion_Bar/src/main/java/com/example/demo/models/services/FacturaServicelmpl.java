package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IFacturaDao;
import com.example.demo.models.entity.Factura;


@Service
public class FacturaServicelmpl implements IFacturaService {
	
	@Autowired
	private IFacturaDao factDao;
	
	
	@Override
	@Transactional (readOnly = true)
	public List<Factura> findAll() {
		return (List<Factura>) factDao.findAll();
	}

	@Override
	@Transactional
	public Factura save(Factura factura) {
		return factDao.save(factura);
	}

	@Override
	@Transactional (readOnly = true)
	public Factura findById(long id) {
		return factDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		factDao.deleteById(id);
	}


}
