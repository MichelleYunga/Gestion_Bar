package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IProducto_CategoriaDao;
import com.example.demo.models.entity.Categoria;


@Service
public class Producto_CategoriaServicelmpl  implements IProducto_CategoriaService{

	@Autowired
	private IProducto_CategoriaDao categoriaDao;

	@Override
	@Transactional (readOnly = true)
	public List<Categoria> findAll() {
		return (List<Categoria>) categoriaDao.findAll();
	}

	@Override
	@Transactional
	public Categoria save(Categoria categoria) {
		return categoriaDao.save(categoria);
	}

	@Override
	@Transactional (readOnly = true)
	public Categoria findById(long id) {
		return categoriaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		categoriaDao.deleteById(id);
	}
	
	
}
