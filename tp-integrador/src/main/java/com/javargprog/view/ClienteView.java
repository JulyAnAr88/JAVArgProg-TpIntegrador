package com.javargprog.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.javargprog.Main;
import com.javargprog.controller.ClienteController;
import com.javargprog.controller.ServicioController;
import com.javargprog.controller.Utility;

public class ClienteView {

	static Scanner lectura = new Scanner(System.in);

	public static void menuCliente() {

		ClienteController cc;
		
		try {
			int opcion;
			String newQuery = "¿Desea hacer otra consulta?";

			do {
				System.out.println();
				System.out.println("------- Menú Cliente --------");
				System.out.println("1 - Agregar");
				System.out.println("2 - Dar de Baja");
				System.out.println("3 - Actualizar");
				System.out.println("4 - Consultar");
				System.out.println("5 - Agregar servicio contratado");
				System.out.println("6 - Atras");
				System.out.println("7 - Salir");
				System.out.print("Opción: ");
				opcion = lectura.nextInt();

				switch (opcion) {
				case 1:

					System.out.print("Ingrese el CUIT del cliente: ");
					String cuit = lectura.next();

					System.out.print("Ingrese la razón social del cliente: ");
					String razonSocial = lectura.next();

					System.out.print("Ingrese el nombre del cliente: ");
					String nombre = lectura.next();

					System.out.print("Ingrese el email del cliente: ");
					String email = lectura.next();

					System.out.println("Se creará unx Cliente con los siguientes datos:");
					System.out.println("Cuit: " + cuit);
					System.out.println("Razón social: " + razonSocial);
					System.out.println("Nombre: " + nombre);
					System.out.println("Email: " + email);

					System.out.print("¿Desea confirmar la operación, coloque 1 para continuar o 2 para cancelar?");
					int op = lectura.nextInt();

					if (op != 1 && op != 2) {
						throw new InputMismatchException(
								"La opción ingresada es incorrecta, finalizando el proceso...");
					}

					if (opcion == 1) {
						cc = new ClienteController(cuit, razonSocial, nombre, email);
						ClienteController.agregarCliente(cc);
					} else {
						menuCliente();
					}
					break;
				case 2:
					System.out.println("Escriba un atributo del/la cliente que desea dar de baja: ");
					String atr = lectura.next();

					cc = ClienteController.consultaCliente(atr);

					System.out.println("¿Confirma que desea dar de baja al cliente ");

					System.out.println(verCliente(cc));

					System.out.println("?");

					System.out.print("1. Continuar");
					System.out.print("2. Cancelar");
					int opBaja = lectura.nextInt();

					if (opBaja != 1 && opBaja != 2) {
						throw new InputMismatchException(
								"La opción ingresada es incorrecta, finalizando el proceso...");
					}

					if (opBaja == 1) {
						ClienteController.bajaCliente(cc);
					} else {
						menuCliente();
					}

					break;
					
				case 3:
					System.out.println("Escriba un atributo del/la cliente que desea modificar: ");
					String atrUpdate = lectura.next();

					cc = ClienteController.consultaCliente(atrUpdate);

					System.out.println("¿Confirma que desea modificar al cliente ");

					System.out.println(cc.getNombre());

					System.out.println("?");

					System.out.print("1. Continuar");
					System.out.print("2. Cancelar");
					int opUpdate = lectura.nextInt();

					if (opUpdate != 1 && opUpdate != 2) {
						throw new InputMismatchException(
								"La opción ingresada es incorrecta, finalizando el proceso...");
					}

					if (opUpdate == 1) {
						System.out.println("--- Atributo a modificar ---");
						System.out.println("1 - CUIT");
						System.out.println("2 - Razón social");
						System.out.println("3 - Nombre");
						System.out.println("4 - Correo");
						System.out.println("5 - Servicio contratado");
						System.out.println("6 - Atras");
						System.out.println("7 - Salir");
						System.out.print("Opción: ");
						opcion = lectura.nextInt();

						switch (opcion) {
						case 1:
						case 2:
						case 3:
						case 4:
						case 5:
							System.out.println("Modificación ");
							String atrUp = lectura.next();

							ClienteController.actualizarCliente(cc, opcion, atrUp);
							break;
						case 6:
							menuCliente();
							break;
						case 7:
							System.exit(0);
							break;
						default:
							break;
						}

					} else {
						menuCliente();
					}
					break;
				case 4:
					System.out.println("Escriba un atributo del/la cliente que desea consultar: ");
					String atrQ = lectura.next();

					cc = ClienteController.consultaCliente(atrQ);
					
					System.out.println(verCliente(cc));
					
					break;
					
				case 5:
					
					System.out.println("Escriba un atributo del/la cliente a quien desea agregar un servicio: ");
					String atrServ = lectura.next();

					cc = ClienteController.consultaCliente(atrServ);
					
					System.out.println("Seleccione y escriba uno de los servicios de la siguiente lista: ");
					
					ServicioController.mostrarTodos().stream().forEach((servicio)->System.out.println(servicio));
									
					atrServ = lectura.next();

					ClienteController.actualizarCliente(cc,5,atrServ);		
					
					break;
				case 6:
					
					Main.menuPrincipal();
					break;
				case 7:
					
					System.exit(0);
					break;
				default:
					System.out.println("Opción no válida. Por favor, elija una opción válida.");
				}
			} while (Utility.otro(newQuery));
		} catch (InputMismatchException e) {
			System.out.println("Opción no válida. Por favor, elija una opción válida.");
			lectura.nextLine();
			menuCliente();
		}
		lectura.nextLine();
	}


	public static String verCliente(ClienteController cc) {
		String cliente = "---Detalle de cliente---\n" + "ID del cliente: " + cc.getId() + "\n" + "Razón social: "
				+ cc.getRazonSocial() + "\n" + "Nombre: " + cc.getNombre() + "\n" + "Email: " + cc.getEmail() + "\n"
				+ "Servicios contratados: \n" + cc.getSeviciosContratados().stream().toString() + "\n"
				+ "Incidentes reportados: " /* + getincidentes.stream().toString() */;
		return cliente;
	}

}
