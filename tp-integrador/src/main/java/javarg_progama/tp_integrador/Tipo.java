package javarg_progama.tp_integrador;

public class Tipo {
	
	private int id;
	private String nombre;
	private String descripcion;
	private int tiempoResolucion;
	
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
