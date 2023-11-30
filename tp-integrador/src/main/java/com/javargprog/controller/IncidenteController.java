package com.javargprog.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.javargprog.model.IncidenteModel;
import com.javargprog.model.TecnicxModel;
import com.javargprog.model.TipoModel;
import com.javargprog.repository.IncidenteRepository;
import com.javargprog.state.EstadoIncidente;
import com.javargprog.state.EstadoIncidenteActivo;
import com.javargprog.state.EstadoIncidenteResuelto;

public class IncidenteController{
	
	private int id;
	private String nombre;
	private String descripcion;
	private List<TipoController> tiposC;
	private List<TipoModel> tiposM;
	private EstadoIncidente estado;
	private boolean activo;
	private boolean resuelto;
	private boolean bloqueado;
	private boolean esComplejo;
	private LocalDateTime fechaIngreso;
	private Date fechaPosibleResolucion;
	private LocalDateTime fechaResolucion;
	private String consideracionesFinales;
	private int horasEstimadas;
	private List<Integer> relacionados;
	private EspecialidadController especialidad;
	private TecnicxController tecnicx;
	
	private static IncidenteModel model;
	private static IncidenteRepository ir;
	
	public IncidenteController(String nombre, String descripcion, LocalDateTime datetime) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaIngreso = datetime;
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
	public List<TipoController> getTipoC() {
		return tiposC;
	}
	public List<TipoModel> getTipoM() {
		return tiposM;
	}
	public void setTipo(TipoController tipo) {
		this.tiposC.add(tipo);
	}
	
	public void setTipo(List<TipoModel> tipos) {
		for(TipoModel tm:tipos) {
			this.tiposC = TipoController.toController(tm);
		}
		this.tiposM = tipos;
	}

	public EstadoIncidente getEstado() {
		return estado;
	}

	public void actualizarEstado(EstadoIncidente estado) {
		this.estado = estado;
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

	public void setFechaResolucion(LocalDateTime localTime) {
		this.fechaResolucion = localTime;
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

	public EspecialidadController getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(EspecialidadController especialidad) {
		this.especialidad = especialidad;
	}

	public TecnicxController getTecnicx() {
		return tecnicx;
	}

	public void setTecnicx(TecnicxController tecnicx) {
		this.tecnicx = tecnicx;
	}

	public boolean isEsComplejo() {
		return esComplejo;
	}

	public void setEsComplejo(boolean esComplejo) {
		this.esComplejo = esComplejo;
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

	public static List<IncidenteController> mostrarTodos() {
		IncidenteRepository ir = new IncidenteRepository();
				
		List<IncidenteModel> incidentesTotales = ir.findAllIncidente();
		
		List<IncidenteController> incidentes = new ArrayList<>(); 
		incidentesTotales.stream().forEach(incidente -> incidentes.add(IncidenteController.toController(incidente)));
				
		return incidentes;
		
	}
	
	public static void agregarIncidente(IncidenteController ic) {
		try {
			model = new IncidenteModel(ic.getNombre(),ic.getDescripcion(), ic.getTipoM(), ic.getFechaIngreso(),
					ic.getFechaPosibleResolucion(),ic.getFechaResolucion(),ic.getConsideracionesFinales(),ic.getHorasEstimadas(),
					ic.getRelacionados(),EspecialidadController.toController(ic.getEspecialidad()), TecnicxModel.toModel(ic.getTecnicx()));

			model.actualizarEstado(new EstadoIncidenteActivo(ic));
			
			ir = new IncidenteRepository();

			ir.createIncidente(model);

		} catch (Exception e) {
			System.out.println("No se pudo crear cliente.");
		}
		
	}

	public static void gestionarIncidente(int atrInc) {
		// TODO Auto-generated method stub
		
	}
	
	public static IncidenteController toController(IncidenteModel im) {
		IncidenteController ic = new IncidenteController(im.getNombre(), im.getDescripcion(), im.getFechaIngreso());
		ic.setConsideracionesFinales(im.getConsideracionesFinales());
		ic.setEsComplejo(im.getEsComplejo());
		ic.setEspecialidad(im.getEspecialidad().toController());
		ic.actualizarEstado(im.getEstado());
		ic.setFechaPosibleResolucion(im.getFechaPosibleResolucion());
		ic.setFechaResolucion(im.getFechaResolucion());
		ic.setHorasEstimadas(im.getHorasEstimadas());
		ic.setRelacionados(im.getRelacionados());
		ic.setTecnicx(TecnicxController.toController(im.getTecnicx()));
		ic.setTipo(im.getTipo());
		return ic;
	}


	public String toString() {
		String s;
		
		s = "ID: "+this.getId()+", nombre: "+ this.getNombre();
		
		return s;
	}

	public static IncidenteController consultarIncidente(Object ob) {
		try {
			ir = new IncidenteRepository();

			model = ir.findIncidente(ob);
		
		} catch (Exception e) {
			System.out.println("No se encontró al cliente.");
		}
		return toController(model);
	}

	public static void resolver(IncidenteController ic) {

		ic.actualizarEstado(new EstadoIncidenteResuelto(ic));
		model = new IncidenteModel(ic.getNombre(),ic.getDescripcion(), ic.getTipoM(), ic.getFechaIngreso(),
				ic.getFechaPosibleResolucion(),ic.getFechaResolucion(),ic.getConsideracionesFinales(),ic.getHorasEstimadas(),
				ic.getRelacionados(),EspecialidadController.toController(ic.getEspecialidad()), TecnicxModel.toModel(ic.getTecnicx()));
		
		ir = new IncidenteRepository();

		ir.updateIncidente(model);
		
	}

	
}
