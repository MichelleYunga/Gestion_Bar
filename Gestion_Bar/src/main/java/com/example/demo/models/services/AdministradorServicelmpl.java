package com.example.demo.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.models.dao.IAdministradorDao;
import com.example.demo.models.entity.Administrador;


@Service
public class AdministradorServicelmpl implements IAdministradorService {
	
	@Autowired
	private IAdministradorDao administradorDao;

	@Override
	@Transactional (readOnly = true)
	public List<Administrador> findAll() {
		return (List<Administrador>) administradorDao.findAll();
		
	}

	@Override
	@Transactional
	public Administrador save(Administrador admin) {
		return administradorDao.save(admin);
	}

	@Override
	@Transactional (readOnly = true)
	public Administrador findById(long id) {
		return administradorDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		administradorDao.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Administrador findByUserPass(String usu_nombreUsuario, String contrasena) {
		// TODO Auto-generated method stub
		return administradorDao.findByUsuNombreUsuarioAndUsuContraUsuario(usu_nombreUsuario, contrasena);
	}
	
	
	
	
	
	

}
