package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IFactura_DetalleDao;
import com.example.demo.models.entity.FacturaDetalle;

@Service
public class Factura_DetalleServicelmpl implements IFactura_DetalleService {
	
	@Autowired
	private IFactura_DetalleDao facDao;
	
	@Override
	@Transactional (readOnly = true)
	public List<FacturaDetalle> findAll() {
		return (List<FacturaDetalle>) facDao.findAll();
	}

	@Override
	@Transactional
	public FacturaDetalle save(FacturaDetalle facturaDetalle) {
		return facDao.save(facturaDetalle);
	}

	@Override
	@Transactional (readOnly = true)
	public FacturaDetalle findById(long id) {
		return facDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		facDao.deleteById(id);
	}

	

	
	

}
