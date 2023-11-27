package javarg_progama.tp_integrador;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Llamada {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="IDENTITY")
	private int id;
	
	@OneToOne
	@JoinColumn(name= "id_cliente", referencedColumnName="id")
	private Cliente cliente;
	
	@OneToOne
	@JoinColumn(name= "id_operadorx", referencedColumnName="id")
	private Operadorx operadorx;
	
	@OneToOne
	@JoinColumn(name= "id_incidente", referencedColumnName="id")
	private Incidente incidente;
	
	
	public Llamada(Cliente cliente, Operadorx operadorx, Incidente incidente) {
		super();
		this.cliente = cliente;
		this.operadorx = operadorx;
		this.incidente = incidente;
	}
	public Llamada() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Incidente getIncidente() {
		return incidente;
	}
	public void setIncidente(Incidente incidente) {
		this.incidente = incidente;
	}
	public Operadorx getOperadorx() {
		return operadorx;
	}
	public void setOperadorx(Operadorx operadorx) {
		this.operadorx = operadorx;
	}
}
