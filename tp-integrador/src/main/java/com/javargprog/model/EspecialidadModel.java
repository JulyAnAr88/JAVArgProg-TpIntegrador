package com.javargprog.model;

import java.util.List;

import com.javargprog.controller.EspecialidadController;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="especialidad", schema = "reporte_incidentes")
public class EspecialidadModel {
	
	public static String nameTable = "especialidad";
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	
	@OneToMany
	@JoinColumn(name="id_tipo", referencedColumnName = "id")
	private List<TipoModel> tipos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<TipoModel> getTipos() {
		return tipos;
	}
	
	public void addTipo(TipoModel tipo) {
		this.tipos.add(tipo);
	}
	
	public void setTipos(List<TipoModel> tipos) {
		this.tipos = tipos;
	}
	public EspecialidadController toController() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
