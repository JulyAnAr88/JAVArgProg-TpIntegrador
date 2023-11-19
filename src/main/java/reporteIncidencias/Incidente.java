package reporteIncidencias;

import java.util.Date;
import java.util.List;

public class Incidente extends Servicio{
	
	private String estado;
	private Date fechaIngreso;
	private Date fechaPosibleResolucion;
	private Date fechaResolucion;
	private String consideracionesFinales;
	private int horasEstimadas;
	private List<Integer> relacionados;
	
	void notificarTecnicx() {}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaPosibleResolucion() {
		return fechaPosibleResolucion;
	}

	public void setFechaPosibleResolucion(Date fechaPosibleResolucion) {
		this.fechaPosibleResolucion = fechaPosibleResolucion;
	}

	public Date getFechaResolucion() {
		return fechaResolucion;
	}

	public void setFechaResolucion(Date fechaResolucion) {
		this.fechaResolucion = fechaResolucion;
	}

	public String getConsideracionesFinales() {
		return consideracionesFinales;
	}

	public void setConsideracionesFinales(String consideracionesFinales) {
		this.consideracionesFinales = consideracionesFinales;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public List<Integer> getRelacionados() {
		return relacionados;
	}

	public void setRelacionados(List<Integer> relacionados) {
		this.relacionados = relacionados;
	}
	
	public void addRelacionado(int relacionado) {
		this.relacionados.add(relacionado);
	}

}
