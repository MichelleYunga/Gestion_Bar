package com.example.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.entity.Pedido;

public interface IPedidoDao  extends CrudRepository<Pedido, Long> {

}
