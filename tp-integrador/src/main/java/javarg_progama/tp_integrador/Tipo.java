package javarg_progama.tp_integrador;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Tipo {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="tiempo_resolucion")
	private int tiempoResolucion;
	
	public Tipo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tipo(String nombre, String descripcion, int tiempoResolucion) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tiempoResolucion = tiempoResolucion;
	}
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
	public int getTiempoResolucion() {
		return tiempoResolucion;
	}
	public void setTiempoResolucion(int tiempoResolucion) {
		this.tiempoResolucion = tiempoResolucion;
	}
}
