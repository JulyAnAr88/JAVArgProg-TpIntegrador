package reporteIncidencias;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tecnicx extends Persona{
	
	private String medioNotificacion;
	private boolean disponible;
	private Map <Integer, Tipo> tiempoDeResolucionPorTipo;
	private List <Incidente> incidentesNuevos;
	private List <Incidente> incidentesResueltos;
	private List <Especialidad> especialidades;
	
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

	public Map<Integer, Tipo> getTiempoDeResolucionPorTipo() {
		return tiempoDeResolucionPorTipo;
	}

	public void setTiempoDeResolucionPorTipo(int horas, Tipo tipo) {
		Map<Integer, Tipo> map = new HashMap<Integer, Tipo>();
		map.put(horas, tipo);
		this.tiempoDeResolucionPorTipo = map;
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
