package com.javargprog.controller;

import java.util.List;

import com.javargprog.model.EspecialidadModel;

public class EspecialidadController {
	
	private int id;
	private List<TipoController> tipos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<TipoController> getTipos() {
		return tipos;
	}
	
	public void addTipo(TipoController tipo) {
		this.tipos.add(tipo);
	}
	
	public void setTipos(List<TipoController> tipos) {
		this.tipos = tipos;
	}
	public static EspecialidadModel toController(EspecialidadController especialidad) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
