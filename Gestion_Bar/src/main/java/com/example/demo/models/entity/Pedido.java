package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pedido;
	private String pedid_descripcion;
	private String pedid_estado;

	@Column(name = "pedid_fecha")
	@Temporal(TemporalType.DATE)
	private Date ped_fecha;

	private String pedid_cantidad;

	// RELACIONES
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto producto;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<Factura> factura;

//	
	
	public Long getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(Long id_pedido) {
		this.id_pedido = id_pedido;
	}

	public String getPedid_descripcion() {
		return pedid_descripcion;
	}

	public void setPedid_descripcion(String pedid_descripcion) {
		this.pedid_descripcion = pedid_descripcion;
	}

	public String getPedid_estado() {
		return pedid_estado;
	}

	public void setPedid_estado(String pedid_estado) {
		this.pedid_estado = pedid_estado;
	}

	public Date getPed_fecha() {
		return ped_fecha;
	}

	public void setPed_fecha(Date ped_fecha) {
		this.ped_fecha = ped_fecha;
	}

	public String getPedid_cantidad() {
		return pedid_cantidad;
	}

	public void setPedid_cantidad(String pedid_cantidad) {
		this.pedid_cantidad = pedid_cantidad;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Producto getProductos() {
		return producto;
	}

	public void setProductos(Producto producto) {
		this.producto = producto;
	}

}
