package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.FacturaDetalle;

public interface IFacturaDetalleDao extends CrudRepository<FacturaDetalle, Long> {

}
