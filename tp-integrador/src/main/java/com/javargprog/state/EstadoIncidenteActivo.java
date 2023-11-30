package com.javargprog.state;

import com.javargprog.controller.IncidenteController;

public class EstadoIncidenteActivo extends EstadoIncidente {

	public EstadoIncidenteActivo(IncidenteController ic) {
		super(ic);
		
	}

	
	public String activo() {
		
		return "En resolución";
	}

	
	public String resuelto() {
	
		return "No resuelto aún";
	}

	
	public String bloqueado() {
	
		return "No bloqueado";
	}

}
