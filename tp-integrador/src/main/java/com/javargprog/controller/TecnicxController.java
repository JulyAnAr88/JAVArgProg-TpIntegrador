package com.javargprog.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.javargprog.model.TecnicxModel;

public class TecnicxController extends PersonaController{
		
	private String medioNotificacion;
	private boolean disponible;
	private Map <Integer, TipoController> tiempoDeResolucionPorTipo;
	private List <IncidenteController> incidentesNuevos;
	private List <IncidenteController> incidentesResueltos;
	private List <EspecialidadController> especialidades;
	
	public TecnicxController(TecnicxModel model) {
		super(model.getCuit(),model.getRazonSocial(),model.getNombre(),model.getEmail());		
	}
	
	/* Cambia estado del Incidente, lo cambia de lista, de incidentesNuevos lo pasa a 
	 * incidentesResueltos y notifica al cliente.
	 * @param idIncidente
	 * @param comentarios
	 * */
	void marcarResuelto(int idIncidente, String comentarios) {
		
	}

	public String getMedioNotificacion() {
		return medioNotificacion;
	}

	public void setMedioNotificacion(String medioNotificacion) {
		this.medioNotificacion = medioNotificacion;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public Map<Integer, TipoController> getTiempoDeResolucionPorTipo() {
		return tiempoDeResolucionPorTipo;
	}

	public void setTiempoDeResolucionPorTipo(int horas, TipoController tipo) {
		Map<Integer, TipoController> map = new HashMap<Integer, TipoController>();
		map.put(horas, tipo);
		this.tiempoDeResolucionPorTipo = map;
	}

	public List<IncidenteController> getIncidentesNuevos() {
		return incidentesNuevos;
	}

	public void setIncidentesNuevos(List<IncidenteController> incidentesNuevos) {
		this.incidentesNuevos = incidentesNuevos;
	}
	
	public void addIncidenteNuevo(IncidenteController incidenteNuevo) {
		this.incidentesNuevos.add(incidenteNuevo);
	}

	public List<IncidenteController> getIncidentesResueltos() {
		return incidentesResueltos;
	}

	public void setIncidentesResueltos(List<IncidenteController> incidentesResueltos) {
		this.incidentesResueltos = incidentesResueltos;
	}
	
	public void addIncidenteResuelto(IncidenteController incidenteResuelto) {
		this.incidentesResueltos.add(incidenteResuelto);
	}

	public List<EspecialidadController> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<EspecialidadController> especialidades) {
		this.especialidades = especialidades;
	}
	
	public void addEspecialidades(EspecialidadController especialidad) {
		this.especialidades.add(especialidad);
	}

	public static TecnicxController toController(TecnicxModel tecnicx) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
