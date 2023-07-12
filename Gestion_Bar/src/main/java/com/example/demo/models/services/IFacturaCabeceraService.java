package com.example.demo.models.services;

import java.util.List;

import com.example.demo.models.entity.FacturaCabecera;

public interface IFacturaCabeceraService {

public List<FacturaCabecera> findAll();
	
	public FacturaCabecera save(FacturaCabecera facCabecera);
	
	public FacturaCabecera findById(long id);
	
	public void delete (long id);
}
