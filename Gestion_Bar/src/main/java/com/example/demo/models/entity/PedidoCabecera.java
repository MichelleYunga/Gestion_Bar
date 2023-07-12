package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name = "pedidoCabeceras")
public class PedidoCabecera implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pedidoC;
	private String pedid_estado;

	@Column(name = "pedid_fecha")
	@Temporal(TemporalType.DATE)
	private Date ped_fecha;

	

	// RELACIONES
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;


	@OneToMany(mappedBy = "pedidoCabecera", cascade = CascadeType.ALL)
	private List<FacturaCabecera> facturacabecera;

	@OneToMany(mappedBy = "pedidoCabecera", cascade = CascadeType.ALL)
	private List<PedidoDetalle> pedidoDetalle;

//	
	
	



	public String getPedid_estado() {
		return pedid_estado;
	}

	public Long getId_pedidoC() {
		return id_pedidoC;
	}

	public void setId_pedidoC(Long id_pedidoC) {
		this.id_pedidoC = id_pedidoC;
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


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
}
