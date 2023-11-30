package com.javargprog.repository;

import java.util.List;

import com.javargprog.model.ClienteModel;


public class ClienteRepository extends GenericRepositoryJPA<ClienteModel> {

	public ClienteRepository() {
		super();
	}		

	public ClienteModel createCliente(final ClienteModel cm) {
		this.create(cm);
		return cm;
	}
	
	public ClienteModel findCliente(final Object oj) {
		return this.find(oj);
	}
	
	public ClienteModel updateCliente(final ClienteModel cm) {
		return this.update(cm);
	}
	
	public List<ClienteModel> findAllCliente() {
		return this.findAll(ClienteModel.nameTable);	
	}
	
}
