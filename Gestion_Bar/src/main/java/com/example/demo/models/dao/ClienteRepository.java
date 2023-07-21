package com.example.demo.models.dao;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	
	

}
