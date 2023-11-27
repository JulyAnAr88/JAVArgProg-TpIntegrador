package javarg_progama.tp_integrador;

import java.util.HashMap;
import java.util.Map;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;

public class Operadorx extends Persona {

	@ElementCollection
	@CollectionTable(name = "operadorx", joinColumns = @JoinColumn(name = "id_operadorx"))
	@MapKeyColumn(name = "tipo")
	@Column(name = "cantidad_horas") 
	private Map<Tipo, Integer> tiempoDeResolucionPorTipo;

	public Operadorx() {
		// TODO Auto-generated constructor stub
	}

	public Operadorx(String nombre, String cuit, String razonSocial, String email) {
		super(nombre, cuit, razonSocial, email);
		// TODO Auto-generated constructor stub
	}

	public Map<Tipo, Integer> getTiempoDeResolucionPorTipo() {
		return tiempoDeResolucionPorTipo;
	}

	public void setTiempoDeResolucionPorTipo( Tipo tipo, int horas) {
		Map<Tipo, Integer> map = new HashMap<Tipo, Integer>();
		map.put(tipo, horas);
		this.tiempoDeResolucionPorTipo = map;
	}

}
