package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IFacturaDetalleDao;
import com.example.demo.models.entity.FacturaDetalle;

@Service
public class FacturaDetalleServicelmpl  implements IFacturaDetalleService{

	

	@Autowired
	private IFacturaDetalleDao facturadetalleDao;

	@Override
	@Transactional (readOnly = true)
	public List<FacturaDetalle> findAll() {
		return (List<FacturaDetalle>) facturadetalleDao.findAll();
	}

	@Override
	@Transactional
	public FacturaDetalle save(FacturaDetalle facturadetalle) {
		return facturadetalleDao.save(facturadetalle);
	}

	@Override
	@Transactional (readOnly = true)
	public FacturaDetalle findById(long id) {
		return facturadetalleDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		facturadetalleDao.deleteById(id);
	}

}
