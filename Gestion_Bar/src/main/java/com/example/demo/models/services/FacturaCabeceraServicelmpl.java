package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IFacturaCabeceraDao;
import com.example.demo.models.entity.FacturaCabecera;

@Service
public class FacturaCabeceraServicelmpl implements IFacturaCabeceraService{


	@Autowired
	private IFacturaCabeceraDao facturacabeceraDao;

	@Override
	@Transactional (readOnly = true)
	public List<FacturaCabecera> findAll() {
		return (List<FacturaCabecera>) facturacabeceraDao.findAll();
	}

	@Override
	@Transactional
	public FacturaCabecera save(FacturaCabecera facturacabecera) {
		return facturacabeceraDao.save(facturacabecera);
	}

	@Override
	@Transactional (readOnly = true)
	public FacturaCabecera findById(long id) {
		return facturacabeceraDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		facturacabeceraDao.deleteById(id);
	}

	

}
