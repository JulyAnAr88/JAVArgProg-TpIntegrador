package javarg_progama.tp_integrador;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="cuit")
	private String cuit;
	
	@Column(name="razon_social")
	private String razonSocial;
	
	@Column(name="email")
	private String email;
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String cuit, String razonSocial, String email) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.email = email;
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
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
