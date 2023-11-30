package com.javargprog.controller;

import com.javargprog.model.PersonaModel;

public class PersonaController {
		
	private PersonaModel model;
		
	public PersonaController(PersonaModel model) {
        this.model = model;
    }
	
	public PersonaController( String cuit, String razonSocial, String nombre,String email) {
		super();
		
		this.model = new PersonaModel(cuit, razonSocial, nombre, email);
	
	}
	
	
	public PersonaController() {
		super();
	}

	public int getId() {
		return model.getId();
	}
	public void setId(int id) {
		this.model.setId(id);
	}
	public String getNombre() {
		return model.getNombre();
	}
	public void setNombre(String nombre) {
		this.model.setNombre(nombre);
	}
	public String getCuit() {
		return model.getCuit();
	}
	public void setCuit(String cuit) {
		this.model.setCuit(cuit);
	}
	public String getRazonSocial() {
		return model.getRazonSocial();
	}
	public void setRazonSocial(String razonSocial) {
		this.model.setRazonSocial(razonSocial);
	}
	public String getEmail() {
		return model.getEmail();
	}
	public void setEmail(String email) {
		this.model.setEmail(email);
	}
	
	public boolean isBaja() {
		return model.isBaja();
	}

	public void setBaja(boolean baja) {
		this.model.setBaja(baja);
	}
}
