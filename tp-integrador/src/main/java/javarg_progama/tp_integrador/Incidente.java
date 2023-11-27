package javarg_progama.tp_integrador;

import java.util.Date;
import java.util.List;

public class Incidente{
	
	private int id;
	private String nombre;
	private String descripcion;
	private List<Tipo> tipos;
	private String estado;
	private Date fechaIngreso;
	private Date fechaPosibleResolucion;
	private Date fechaResolucion;
	private String consideracionesFinales;
	private int horasEstimadas;
	private List<Integer> relacionados;
	private Especialidad especialidad;
	private Tecnicx tecnicx;
	
	void notificarTecnicx() {}
	
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
	public List<Tipo> getTipo() {
		return tipos;
	}
	public void setTipo(Tipo tipo) {
		this.tipos.add(tipo);
	}
	
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

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}

	public Tecnicx getTecnicx() {
		return tecnicx;
	}

	public void setTecnicx(Tecnicx tecnicx) {
		this.tecnicx = tecnicx;
	}

}
