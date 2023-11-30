package com.javargprog.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.javargprog.model.ServicioModel;
import com.javargprog.model.TipoModel;

public class ServicioController {
	
	static List<ServicioController> servicios = new ArrayList<>();
	
	private ServicioModel model;
		
	public int getId() {
		return model.getId();
	}
	public void setId(int id) {
		this.model.setId(id);
	}
	public String getNombre() {
		return model.getNombre();
	}
	public void setNombre(String nombre) {
		this.model.setNombre(nombre);
	}
	public String getDescripcion() {
		return model.getDescripcion();
	}
	public void setDescripcion(String descripcion) {
		this.model.setDescripcion(descripcion);
	}
	public TipoModel getTipo() {
		return model.getTipo();
	}
	public void setTipo(TipoModel tipo) {
		this.model.setTipo(tipo);
	}
	
	public boolean isBaja() {
		return model.isBaja();
	}

	public void setBaja(boolean baja) {
		this.model.setBaja(baja);
	}
	public static List<ServicioController> mostrarTodos() {
		List<ServicioController> serviciosDisponibles = servicios.stream().filter((servicio)->
		!servicio.isBaja()).collect(Collectors.toList());
		
		return serviciosDisponibles;
	}
	
	public String toString() {
		String s;
		
		s = "ID: "+this.getId()+", nombre: "+ this.getNombre();
		
		return s;
	}
	
}
