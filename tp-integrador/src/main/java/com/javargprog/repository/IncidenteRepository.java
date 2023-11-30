package com.javargprog.repository;

import java.util.List;

import com.javargprog.model.IncidenteModel;

public class IncidenteRepository extends GenericRepositoryJPA<IncidenteModel> {

	public IncidenteRepository() {
		super();
	}
	
	public IncidenteModel createIncidente(final IncidenteModel im) {
		this.create(im);
		return im;
	}
	
	public IncidenteModel findIncidente(final Object oj) {
		return this.find(oj);
	}
	
	public IncidenteModel updateIncidente(final IncidenteModel im) {
		return this.update(im);
	}
	
	public List<IncidenteModel> findAllIncidente() {
		return this.findAll(IncidenteModel.nameTable);	
	}
	
}
