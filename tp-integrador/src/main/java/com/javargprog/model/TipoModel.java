package com.javargprog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipo", schema = "reporte_incidentes")
public class TipoModel {
	
	public static String nameTable = "tipo";
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="tiempo_resolucion")
	private int tiempoResolucion;
	
	public TipoModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoModel(String nombre, String descripcion, int tiempoResolucion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tiempoResolucion = tiempoResolucion;
	}
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
}
