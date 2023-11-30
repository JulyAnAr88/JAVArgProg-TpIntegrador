package com.javargprog.state;

import com.javargprog.controller.IncidenteController;

public class EstadoIncidenteResuelto extends EstadoIncidente {

	public EstadoIncidenteResuelto(IncidenteController ic) {
		super(ic);		
		ic.setActivo(false);		
	}
	
	public String activo() {
		ic.actualizarEstado(new EstadoIncidenteActivo(IncidenteController.toController(ic)));
		return "Resuelto";
	}

	
	public String resuelto() {
		if(!ic.isBloqueado()) {
			ic.actualizarEstado(new EstadoIncidenteResuelto(IncidenteController.toController(ic)));
		}
		return "Resuelto";
	}

	
	public String bloqueado() {
		ic.actualizarEstado(new EstadoIncidenteBloqueado(IncidenteController.toController(ic)));
		return "Resuelto";
	}


}
