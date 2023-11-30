package com.javargprog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="llamada")
public class LlamadaModel {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	
	@OneToOne
	@JoinColumn(name= "id_cliente", referencedColumnName="id")
	private ClienteModel cliente;
	
	@OneToOne
	@JoinColumn(name= "id_operadorx", referencedColumnName="id")
	private OperadorxModel operadorx;
	
	@OneToOne
	@JoinColumn(name= "id_incidente", referencedColumnName="id")
	private IncidenteModel incidente;
	
	
	public LlamadaModel(ClienteModel cliente, OperadorxModel operadorx, IncidenteModel incidente) {
		super();
		this.cliente = cliente;
		this.operadorx = operadorx;
		this.incidente = incidente;
	}
	public LlamadaModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ClienteModel getCliente() {
		return cliente;
	}
	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}
	public IncidenteModel getIncidente() {
		return incidente;
	}
	public void setIncidente(IncidenteModel incidente) {
		this.incidente = incidente;
	}
	public OperadorxModel getOperadorx() {
		return operadorx;
	}
	public void setOperadorx(OperadorxModel operadorx) {
		this.operadorx = operadorx;
	}
}
