package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="facturas")
public class Factura  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_factura;
	private String estado;
	
	@Column(name="fechafactura")
	@Temporal(TemporalType.DATE)
	private Date fecha;

	//RELACIONES
			@ManyToOne
			@JoinColumn(name = "id_pedido")
			private Pedido pedido;

			@ManyToOne
			@JoinColumn(name = "id_cliente")
			private Cliente cliente;
			
		@ManyToOne
			@JoinColumn(name = "id_detalle")
			private FacturaDetalle facturaDetalle;
		//
	
	
	public Long getId_factura() {
		return id_factura;
	}

	public void setId_factura(Long id_factura) {
		this.id_factura = id_factura;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	//public FacturaDetalle getFactdetalle() {
		//return factdetalle;
	//}

	//public void setFactdetalle(FacturaDetalle factdetalle) {
		//this.factdetalle = factdetalle;
	//}
	
	
	
	
	

}
