package javarg_progama.tp_integrador;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Especialidad {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	
	@OneToMany
	@JoinColumn(name="id_tipo", referencedColumnName = "id")
	private List<Tipo> tipos;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Tipo> getTipos() {
		return tipos;
	}
	
	public void addTipo(Tipo tipo) {
		this.tipos.add(tipo);
	}
	
	public void setTipos(List<Tipo> tipos) {
		this.tipos = tipos;
	}

	
	
}
