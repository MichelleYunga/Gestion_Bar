package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="facturacabeceras")
public class FacturaCabecera  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_facturaC;
	

	//RELACIONES
			@ManyToOne
			@JoinColumn(name = "id_pedidoC")
			private PedidoCabecera pedidoCabecera;

		
		
			@OneToMany(mappedBy="facturacabecera", cascade = CascadeType.ALL)
			private List<FacturaDetalle> facturadetalle;
			
			
		//
	
	
	

	
	public PedidoCabecera getPedido() {
		return pedidoCabecera;
	}

	public Long getId_facturaC() {
		return id_facturaC;
	}

	public void setId_facturaC(Long id_facturaC) {
		this.id_facturaC = id_facturaC;
	}

	public void setPedido(PedidoCabecera pedidoCabecera) {
		this.pedidoCabecera = pedidoCabecera;
	}

	//public Cliente getCliente() {
		//return cliente;
	//}

	//public void setCliente(Cliente cliente) {
		//this.cliente = cliente;
	//}

	//public FacturaDetalle getFactdetalle() {
		//return factdetalle;
	//}

	//public void setFactdetalle(FacturaDetalle factdetalle) {
		//this.factdetalle = factdetalle;
	//}
	
	
	
	
	

}
