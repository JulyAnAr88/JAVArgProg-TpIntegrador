package com.javargprog.controller;

import java.util.List;

import com.javargprog.model.ClienteModel;
import com.javargprog.repository.ClienteRepository;

public class ClienteController extends PersonaController {

	static ClienteModel model;
	static ClienteRepository cr;

	private List<ServicioController> seviciosContratados;

	public ClienteController(String cuit, String razonSocial, String nombre, String email) {

		super(cuit, razonSocial, nombre, email);
	}

	public ClienteController() {
		super();
	}

	public List<ServicioController> getSeviciosContratados() {
		return seviciosContratados;
	}

	public void setSeviciosContratados(List<ServicioController> seviciosContratados) {
		this.seviciosContratados = seviciosContratados;
	}

	public void addSevicioContratado(ServicioController sevicioContratado) {
		this.seviciosContratados.add(sevicioContratado);
	}

	public static void agregarCliente(ClienteController cc) {

		try {
			model = new ClienteModel(cc.getCuit(), cc.getRazonSocial(), cc.getNombre(), cc.getEmail());

			cr = new ClienteRepository();

			cr.createCliente(model);

		} catch (Exception e) {
			System.out.println("No se pudo crear cliente.");
		}
	}

	public static void bajaCliente(Object atributo) {
		try {
			cr = new ClienteRepository();

			actualizarCliente(cr.findCliente(atributo), 6, "1");

		} catch (Exception e) {
			System.out.println("No se pudo dar de baja al cliente.");
		}

	}

	public static ClienteController consultaCliente(String cliente) {
		try {
			cr = new ClienteRepository();

			model = cr.findCliente(cliente);
		
		} catch (Exception e) {
			System.out.println("No se encontró al cliente.");
		}
		return toController(model);
	}
	
	public static void actualizarCliente(ClienteModel cm, int atr, String atrUp) {
		try {
			model = cm;
			cr = new ClienteRepository();
			switch (atr) {
			case 1:
				model.setCuit(atrUp);
				cr.updateCliente(model);
				break;
			case 2:
				model.setRazonSocial(atrUp);
				cr.updateCliente(model);
				break;
			case 3:
				model.setNombre(atrUp);
				cr.updateCliente(model);
				break;
			case 4:
				model.setEmail(atrUp);
				cr.updateCliente(model);
				break;
			case 5:
				model.setSeviciosContratados(atrUp);
				cr.updateCliente(model);
				break;
			case 6:
				if(atrUp=="1") {
					model.setBaja(true);
				}else {
					model.setBaja(false);
				}				
				cr.updateCliente(model);
				break;
			default:
				break;
			}			
		} catch (Exception e) {
			System.out.println("No se pudo modificar al cliente.");
		}

	}

	public static void actualizarCliente(ClienteController cc, int atr, String atrUp) {
		try {
			model = new ClienteModel(cc.getCuit(), cc.getRazonSocial(), cc.getNombre(), cc.getEmail());
			cr = new ClienteRepository();
			switch (atr) {
			case 1:
				model.setCuit(atrUp);
				cr.updateCliente(model);
				break;
			case 2:
				model.setRazonSocial(atrUp);
				cr.updateCliente(model);
				break;
			case 3:
				model.setNombre(atrUp);
				cr.updateCliente(model);
				break;
			case 4:
				model.setEmail(atrUp);
				cr.updateCliente(model);
				break;
			case 5:
				model.setSeviciosContratados(atrUp);
				cr.updateCliente(model);
				break;
			case 6:
				if(atrUp=="1") {
					model.setBaja(true);
				}else {
					model.setBaja(false);
				}				
				cr.updateCliente(model);
				break;
			default:
				break;
			}			
		} catch (Exception e) {
			System.out.println("No se pudo modificar al cliente.");
		}

	}
	
	
	public static ClienteController toController(ClienteModel cm) {
		ClienteController cc = new ClienteController(cm.getCuit(), cm.getRazonSocial(), cm.getNombre(), cm.getEmail());
		cc.setBaja(cm.isBaja());
		//cc.setSeviciosContratados(cm.getSeviciosContratados());
		return cc;
	}


}
