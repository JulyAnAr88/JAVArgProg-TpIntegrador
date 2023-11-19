package reporteIncidencias;

import java.util.List;

public class Especialidad {
	
	private int id;
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
