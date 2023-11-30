package com.javargprog.model;

import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="operadorx", schema = "reporte_incidentes")
public class OperadorxModel extends PersonaModel {
	
	public static String nameTable = "operadorx"; 

	@ElementCollection
	@CollectionTable(name = "operadorx", joinColumns = @JoinColumn(name = "id_operadorx"))
	@MapKeyColumn(name = "tipo")
	@Column(name = "cantidad_horas") 
	private Map<TipoModel, Integer> tiempoDeResolucionPorTipo;

	public OperadorxModel(String nombre, String cuit, String razonSocial, String email) {
		super(nombre, cuit, razonSocial, email);
		// TODO Auto-generated constructor stub
	}

	public Map<TipoModel, Integer> getTiempoDeResolucionPorTipo() {
		return tiempoDeResolucionPorTipo;
	}

	public void setTiempoDeResolucionPorTipo( TipoModel tipo, int horas) {
		Map<TipoModel, Integer> map = new HashMap<TipoModel, Integer>();
		map.put(tipo, horas);
		this.tiempoDeResolucionPorTipo = map;
	}

}
