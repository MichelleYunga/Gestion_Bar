package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IProducto_CategoriaDao;
import com.example.demo.models.entity.Producto_Categoria;


@Service
public class Producto_CategoriaServicelmpl  implements IProducto_CategoriaService{

	@Autowired
	private IProducto_CategoriaDao categoriaDao;

	@Override
	@Transactional (readOnly = true)
	public List<Producto_Categoria> findAll() {
		return (List<Producto_Categoria>) categoriaDao.findAll();
	}

	@Override
	@Transactional
	public Producto_Categoria save(Producto_Categoria producto_Categoria) {
		return categoriaDao.save(producto_Categoria);
	}

	@Override
	@Transactional (readOnly = true)
	public Producto_Categoria findById(long id) {
		return categoriaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		categoriaDao.deleteById(id);
	}
	
	
}
