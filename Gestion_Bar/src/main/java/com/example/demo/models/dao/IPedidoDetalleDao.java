package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.PedidoDetalle;

public interface IPedidoDetalleDao extends CrudRepository<PedidoDetalle, Long> {

}
