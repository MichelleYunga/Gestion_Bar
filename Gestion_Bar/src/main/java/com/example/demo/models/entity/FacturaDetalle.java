package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="FacturaDetalles")
public class FacturaDetalle implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_detalle;
	private Double total;
	

	// RELACIONES
		@OneToMany(mappedBy="facturaDetalle", cascade = CascadeType.ALL)
		private List<Factura> factura;
		
	///
	
	public Double getTotal() {
		return total;
	}
	public Long getId_detalle() {
		return id_detalle;
	}
	public void setId_detalle(Long id_detalle) {
		this.id_detalle = id_detalle;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	
	

}
