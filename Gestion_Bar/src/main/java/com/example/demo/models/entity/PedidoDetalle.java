package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
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
@Table(name = "pedidoDetalles", uniqueConstraints = {@UniqueConstraint(columnNames ={"id_pedidoC", "id_producto"})})
public class PedidoDetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pedidoD;
	private Integer Cantidad;
	private Double total;

	// RELACIONES
	@OneToMany(mappedBy="pedidoDetalle", cascade = CascadeType.ALL)
	private List<FacturaDetalle> facturaDetalle;
	
	
	@ManyToOne
	@JoinColumn(name = "id_pedidoC")
	private PedidoCabecera pedidoCabecera;
	
	
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto producto;

	//

	public Long getId_pedidoD() {
		return id_pedidoD;
	}

	public void setId_pedidoD(Long id_pedidoD) {
		this.id_pedidoD = id_pedidoD;
	}

	public Integer getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}



	public PedidoCabecera getPedidoCabecera() {
		return pedidoCabecera;
	}

	public void setPedidoCabecera(PedidoCabecera pedidoCabecera) {
		this.pedidoCabecera = pedidoCabecera;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	

}
