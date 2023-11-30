package com.javargprog.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.javargprog.controller.IncidenteController;
import com.javargprog.state.EstadoIncidente;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="incidente", schema = "reporte_incidentes")
public class IncidenteModel{
	public static String nameTable = "incidente";
	
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
	private List<TipoModel> tipos;
	
	@OneToOne
	@JoinColumn(name = "id_estado", referencedColumnName = "id")
	private EstadoIncidente estado;
	
	@Column(name="estado_activo")
	private boolean activo;
	
	@Column(name="estado_resuelto")
	private boolean resuelto;
	
	@Column(name="estado_bloqueado")
	private boolean bloqueado;
	
	@Column(name="es_complejo")
	private boolean esComplejo;
	
	@Column(name="fecha_ingreso")
	private LocalDateTime fechaIngreso;
	
	@Column(name="fecha_posible_resolucion")
	private Date fechaPosibleResolucion;
	
	@Column(name="fecha_resolucion")
	private LocalDateTime fechaResolucion;
	
	@Column(name="consideraciones_finales")
	private String consideracionesFinales;
	
	@Column(name="horas_estimadas")
	private int horasEstimadas;
	
	@ElementCollection(targetClass = String.class, fetch = FetchType.LAZY)
	@CollectionTable(name = "relacionados", joinColumns = @JoinColumn(name = "id_incidente"))
	@Column(name = "relacionados")
	private List<Integer> relacionados;
	
	@OneToOne
	@JoinColumn(name= "id_especialidad", referencedColumnName="id")
	private EspecialidadModel especialidad;
	
	@OneToOne
	@JoinColumn(name= "id_tecnicx", referencedColumnName="id")
	private TecnicxModel tecnicx;
	
	public IncidenteModel(String nombre, String descripcion, List<TipoModel> tipos, LocalDateTime fechaIngreso,
			Date fechaPosibleResolucion, LocalDateTime fechaResolucion, String consideracionesFinales, int horasEstimadas,
			List<Integer> relacionados, EspecialidadModel especialidad, TecnicxModel tecnicx) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipos = tipos;
		this.fechaIngreso = fechaIngreso;
		this.fechaPosibleResolucion = fechaPosibleResolucion;
		this.fechaResolucion = fechaResolucion;
		this.consideracionesFinales = consideracionesFinales;
		this.horasEstimadas = horasEstimadas;
		this.relacionados = relacionados;
		this.especialidad = especialidad;
		this.tecnicx = tecnicx;
	}
	
	public IncidenteModel() {
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
	public List<TipoModel> getTipo() {
		return tipos;
	}
	public void setTipo(TipoModel tipo) {
		this.tipos.add(tipo);
	}
		
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaPosibleResolucion() {
		return fechaPosibleResolucion;
	}

	public void setFechaPosibleResolucion(Date fechaPosibleResolucion) {
		this.fechaPosibleResolucion = fechaPosibleResolucion;
	}

	public LocalDateTime getFechaResolucion() {
		return fechaResolucion;
	}

	public void setFechaResolucion(LocalDateTime fechaResolucion) {
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

	public EspecialidadModel getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(EspecialidadModel especialidad) {
		this.especialidad = especialidad;
	}

	public TecnicxModel getTecnicx() {
		return tecnicx;
	}

	public void setTecnicx(TecnicxModel tecnicx) {
		this.tecnicx = tecnicx;
	}

	public boolean getEsComplejo() {
		return esComplejo;
	}
	
	public void setEsComplejo(boolean complejo) {
		this.esComplejo = complejo;
	}
	
	public boolean isResuelto() {
		return resuelto;
	}

	public void setResuelto(boolean resuelto) {
		this.resuelto = resuelto;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	
	public EstadoIncidente getEstado() {
		return estado;
	}

	public void actualizarEstado(EstadoIncidente estado) {
		this.estado = estado;
	}

	public static IncidenteModel toModel(IncidenteController ic) {
		// TODO Auto-generated method stub
		return null;
	}

}
