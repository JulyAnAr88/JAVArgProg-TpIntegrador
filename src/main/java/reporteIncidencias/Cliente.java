package reporteIncidencias;

import java.util.List;

public class Cliente extends Persona{
	
	private List<Servicio> seviciosContratados;

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
