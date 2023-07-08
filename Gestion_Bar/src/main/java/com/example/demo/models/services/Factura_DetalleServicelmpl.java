package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IFactura_DetalleDao;
import com.example.demo.models.entity.Factura_Detalle;

@Service
public class Factura_DetalleServicelmpl implements IFactura_DetalleService {
	
	@Autowired
	private IFactura_DetalleDao facDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<Factura_Detalle> findAll() {
		return (List<Factura_Detalle>) facDao.findAll();
	}

	@Override
	@Transactional
	public Factura_Detalle save(Factura_Detalle factura_Detalle) {
		return facDao.save(factura_Detalle);
	}

	@Override
	@Transactional (readOnly = true)
	public Factura_Detalle findById(long id) {
		return facDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		facDao.deleteById(id);
	}

	

	
	

}
