package javarg_progama.tp_integrador;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Tecnicx extends Persona{
	
	@Column(name="medio_notificacion")
	private String medioNotificacion;
	
	@Column(name="disponible")
	private boolean disponible;
	
	@OneToMany
	@JoinColumn(name="id_incidente", referencedColumnName = "id")
	private List <Incidente> incidentesNuevos;
	
	@OneToMany
	@JoinColumn(name="id_incidente", referencedColumnName = "id")
	private List <Incidente> incidentesResueltos;
	
	@OneToMany
	@JoinColumn(name="id_especialidad", referencedColumnName = "id")
	private List <Especialidad> especialidades;
	
	public Tecnicx() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tecnicx(String nombre, String cuit, String razonSocial, String email) {
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
	
	public List<Incidente> getIncidentesNuevos() {
		return incidentesNuevos;
	}

	public void setIncidentesNuevos(List<Incidente> incidentesNuevos) {
		this.incidentesNuevos = incidentesNuevos;
	}
	
	public void addIncidenteNuevo(Incidente incidenteNuevo) {
		this.incidentesNuevos.add(incidenteNuevo);
	}

	public List<Incidente> getIncidentesResueltos() {
		return incidentesResueltos;
	}

	public void setIncidentesResueltos(List<Incidente> incidentesResueltos) {
		this.incidentesResueltos = incidentesResueltos;
	}
	
	public void addIncidenteResuelto(Incidente incidenteResuelto) {
		this.incidentesResueltos.add(incidenteResuelto);
	}

	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}
	
	public void addEspecialidades(Especialidad especialidad) {
		this.especialidades.add(especialidad);
	}
	
	
	

}
