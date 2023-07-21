package com.example.demo.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.models.entity.Administrador;

public interface IAdministradorDao  extends CrudRepository<Administrador, Long>{
	
	//¡¡¡¡¡¡¡¡¡¡AGREGAR EL NEW ( constructor ) este debe estar definido para 
		//crear el objeto usuario solo con los atributos que necesito
		@Query("SELECT new Administrador(a.id_administrador , a.usuario, a.contrase)  FROM Administrador a WHERE a.usuario = :usuario AND a.contrase = :contrasena  ")
		//tener cuidado findBy-UsuarioNombre
		//siempre tiene que ir el findBy y el nombre los atributos tal y como esta en la clase usuario el AND sirve para separar los atributos que se van a usar para buscar
		Administrador findByUsuNombreUsuarioAndUsuContraUsuario(@Param("usuario") String UsuNombreUsuario, @Param("contrasena") String UsuContraUsuario);
		
		
		
		
		
		

}
