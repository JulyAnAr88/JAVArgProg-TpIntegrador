package com.javargprog.model;

import java.util.List;

import com.javargprog.controller.TecnicxController;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tecnicx", schema = "reporte_incidentes")
public class TecnicxModel extends PersonaModel{
	public static String nameTable = "tecnicx";
	
	@Column(name="medio_notificacion")
	private String medioNotificacion;
	
	@Column(name="disponible")
	private boolean disponible;
	
	@OneToMany
	@JoinColumn(name="id_incidente", referencedColumnName = "id")
	private List <IncidenteModel> incidentesNuevos;
	
	@OneToMany
	@JoinColumn(name="id_incidente", referencedColumnName = "id")
	private List <IncidenteModel> incidentesResueltos;
	
	@OneToMany
	@JoinColumn(name="id_especialidad", referencedColumnName = "id")
	private List <EspecialidadModel> especialidades;

	public TecnicxModel(String nombre, String cuit, String razonSocial, String email) {
		super(nombre, cuit, razonSocial, email);
		// TODO Auto-generated constructor stub
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
	
	public List<IncidenteModel> getIncidentesNuevos() {
		return incidentesNuevos;
	}

	public void setIncidentesNuevos(List<IncidenteModel> incidentesNuevos) {
		this.incidentesNuevos = incidentesNuevos;
	}
	
	public void addIncidenteNuevo(IncidenteModel incidenteNuevo) {
		this.incidentesNuevos.add(incidenteNuevo);
	}

	public List<IncidenteModel> getIncidentesResueltos() {
		return incidentesResueltos;
	}

	public void setIncidentesResueltos(List<IncidenteModel> incidentesResueltos) {
		this.incidentesResueltos = incidentesResueltos;
	}
	
	public void addIncidenteResuelto(IncidenteModel incidenteResuelto) {
		this.incidentesResueltos.add(incidenteResuelto);
	}

	public List<EspecialidadModel> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<EspecialidadModel> especialidades) {
		this.especialidades = especialidades;
	}
	
	public void addEspecialidades(EspecialidadModel especialidad) {
		this.especialidades.add(especialidad);
	}

	public TecnicxController toController() {
		// TODO Auto-generated method stub
		return null;
	}

	public static TecnicxModel toModel(TecnicxController tecnicx) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
