package com.javargprog.state;

import com.javargprog.controller.IncidenteController;
import com.javargprog.model.IncidenteModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="estado_incidente", schema = "reporte_incidentes")
public abstract class EstadoIncidente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne(mappedBy = "estado")
	IncidenteModel ic;
	
	EstadoIncidente(IncidenteController ic){
		this.ic = IncidenteModel.toModel(ic);
	}
	
	  public abstract String activo();
	  public abstract String resuelto();
	  public abstract String bloqueado();
	
}
