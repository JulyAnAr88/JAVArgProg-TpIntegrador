package javarg_progama.tp_integrador;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

public class Incidente{
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@OneToMany
	@JoinColumn(name="id_tipo", referencedColumnName = "id")
	private List<Tipo> tipos;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="fecha_ingreso")
	private Date fechaIngreso;
	
	@Column(name="fecha_posible_resolucion")
	private Date fechaPosibleResolucion;
	
	@Column(name="fecha_resolucion")
	private Date fechaResolucion;
	
	@Column(name="consideraciones_finales")
	private String consideracionesFinales;
	
	@Column(name="horas_estimadas")
	private int horasEstimadas;
	
	
	private List<Integer> relacionados;
	
	@OneToOne
	@JoinColumn(name= "id_especialidad", referencedColumnName="id")
	private Especialidad especialidad;
	
	@OneToOne
	@JoinColumn(name= "id_tecnicx", referencedColumnName="id")
	private Tecnicx tecnicx;
	
	public Incidente(String nombre, String descripcion, List<Tipo> tipos, String estado, Date fechaIngreso,
			Date fechaPosibleResolucion, Date fechaResolucion, String consideracionesFinales, int horasEstimadas,
			List<Integer> relacionados, Especialidad especialidad, Tecnicx tecnicx) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipos = tipos;
		this.estado = estado;
		this.fechaIngreso = fechaIngreso;
		this.fechaPosibleResolucion = fechaPosibleResolucion;
		this.fechaResolucion = fechaResolucion;
		this.consideracionesFinales = consideracionesFinales;
		this.horasEstimadas = horasEstimadas;
		this.relacionados = relacionados;
		this.especialidad = especialidad;
		this.tecnicx = tecnicx;
	}
	
	public Incidente() {
		super();
	}

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
