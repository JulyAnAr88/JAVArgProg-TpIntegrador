package com.javargprog.controller;

public class LlamadaController {
	
	private int id;
	private ClienteController cliente;
	private IncidenteController incidente;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ClienteController getCliente() {
		return cliente;
	}
	public void setCliente(ClienteController cliente) {
		this.cliente = cliente;
	}
	public IncidenteController getIncidente() {
		return incidente;
	}
	public void setIncidente(IncidenteController incidente) {
		this.incidente = incidente;
	}
	public static void nuevaLlamada() {
		// TODO Auto-generated method stub
		
	}
}
