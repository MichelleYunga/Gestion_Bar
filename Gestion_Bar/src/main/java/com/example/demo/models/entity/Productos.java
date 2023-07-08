package com.example.demo.models.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_producto;
	private Integer prod_cantidad;
	private String prod_descripción;

	@Column(name = "prod_img", columnDefinition = "LONGBLOB")
	private String prod_img;

	
	
	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public Integer getProd_cantidad() {
		return prod_cantidad;
	}

	public void setProd_cantidad(Integer prod_cantidad) {
		this.prod_cantidad = prod_cantidad;
	}

	public String getProd_descripción() {
		return prod_descripción;
	}

	public void setProd_descripción(String prod_descripción) {
		this.prod_descripción = prod_descripción;
	}

	public String getProd_img() {
		return prod_img;
	}

	public void setProd_img(String prod_img) {
		this.prod_img = prod_img;
	}

}
