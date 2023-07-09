package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "productos", uniqueConstraints = {@UniqueConstraint(columnNames ={"prod_codigo"})})
public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_producto;
	private String prod_codigo;
	private Integer prod_cantidad;
	private String prod_descripción;

	@Column(name = "prod_img", columnDefinition = "LONGBLOB")
	private String prod_img;

	
	// RELACIONES
	@OneToMany(mappedBy="producto", cascade = CascadeType.ALL)
	private List<Pedido> pedido;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	//
	
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getProd_codigo() {
		return prod_codigo;
	}

	public void setProd_codigo(String prod_codigo) {
		this.prod_codigo = prod_codigo;
	}

	

	

}
