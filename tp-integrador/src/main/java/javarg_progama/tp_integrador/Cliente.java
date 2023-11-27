package javarg_progama.tp_integrador;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente extends Persona{

	@OneToMany
	@JoinColumn(name="id_servicio", referencedColumnName = "id")
	private List<Servicio> seviciosContratados;
	
	public Cliente(String nombre, String cuit, String razonSocial, String email) {
		super(nombre, cuit, razonSocial, email);
		// TODO Auto-generated constructor stub
	}

	public Cliente() {
		super();
	}
	

	public List<Servicio> getSeviciosContratados() {
		return seviciosContratados;
	}

	public void setSeviciosContratados(List<Servicio> seviciosContratados) {
		this.seviciosContratados = seviciosContratados;
	} 
	
	public void addSevicioContratado(Servicio sevicioContratado) {
		this.seviciosContratados.add(sevicioContratado);
	} 
}
