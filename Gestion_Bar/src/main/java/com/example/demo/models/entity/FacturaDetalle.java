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
@Table (name="FacturaDetalles", uniqueConstraints = {@UniqueConstraint(columnNames ={"id_facturaC", "id_pedidoD"})})
public class FacturaDetalle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_facturaD;
	

	// RELACIONES
		
	@ManyToOne
	@JoinColumn(name = "id_facturaC")
	private FacturaCabecera facturaCabecera;

	@ManyToOne
	@JoinColumn(name = "id_pedidoD")
	private PedidoDetalle pedidoDetalle;

	///
	
	public Long getId_facturaD() {
		return id_facturaD;
	}

	public void setId_facturaD(Long id_facturaD) {
		this.id_facturaD = id_facturaD;
	}

	
	public FacturaCabecera getFacturaCabecera() {
		return facturaCabecera;
	}

	public void setFacturaCabecera(FacturaCabecera facturaCabecera) {
		this.facturaCabecera = facturaCabecera;
	}

	public PedidoDetalle getPedidoDetalle() {
		return pedidoDetalle;
	}

	public void setPedidoDetalle(PedidoDetalle pedidoDetalle) {
		this.pedidoDetalle = pedidoDetalle;
	}

	
	
	
	

}
