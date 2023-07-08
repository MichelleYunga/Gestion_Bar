package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IProductosDao;
import com.example.demo.models.entity.Productos;


@Service
public class ProductoServicelmpl implements IProductoService{


	@Autowired
	private IProductosDao productoDao;

	@Override
	@Transactional (readOnly = true)
	public List<Productos> findAll() {
		return (List<Productos>) productoDao.findAll();
	}

	@Override
	@Transactional
	public Productos save(Productos producto) {
		return productoDao.save(producto);
	}

	@Override
	@Transactional (readOnly = true)
	public Productos findById(long id) {
		return productoDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		productoDao.deleteById(id);
	}

}
