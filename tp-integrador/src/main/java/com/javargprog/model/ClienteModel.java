package com.javargprog.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente", schema = "reporte_incidentes")
public class ClienteModel extends PersonaModel{

	public static String nameTable =  "cliente";
	
	@OneToMany
	@JoinColumn(name="id_servicio", referencedColumnName = "id")
	private List<ServicioModel> seviciosContratados;
	
	public ClienteModel(String cuit, String razonSocial, String nombre, String email) {
		super(cuit,razonSocial,nombre,email);
		
	}
	
	public List<ServicioModel> getSeviciosContratados() {
		return seviciosContratados;
	}

	public void setSeviciosContratados(String seviciosContratados) {
		ServicioModel servicio = new ServicioModel();
		servicio.setNombre(seviciosContratados);
		this.seviciosContratados.add(servicio);
	}
	
	
	
	
}
