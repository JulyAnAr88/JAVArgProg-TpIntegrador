package com.javargprog.controller;

import java.util.List;

import com.javargprog.model.TipoModel;

public class TipoController {
	
	private int id;
	private String nombre;
	private String descripcion;
	private int tiempoResolucion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getTiempoResolucion() {
		return tiempoResolucion;
	}
	public void setTiempoResolucion(int tiempoResolucion) {
		this.tiempoResolucion = tiempoResolucion;
	}
	public static List<TipoController> toController(TipoModel tm) {
		// TODO Auto-generated method stub
		return null;
	}
}
