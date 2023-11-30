package com.javargprog.view;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.javargprog.Main;
import com.javargprog.controller.IncidenteController;
import com.javargprog.controller.ServicioController;
import com.javargprog.controller.Utility;
import com.javargprog.model.IncidenteModel;

public class IncidenteView {
	static Scanner lectura = new Scanner(System.in);

	public static void menuIncidente() {

		IncidenteController ic;
		LocalDateTime datetime = LocalDateTime.now();
		 
		
		try {
			int opcion = 0;
			int idInc = 0;
			String newQuery = "¿Desea hacer otra gestión?";

			do {
				System.out.println();
				System.out.println("--- Menú Incidente ---");
				System.out.println("1 - Agregar");
				System.out.println("2 - Resolver");
				System.out.println("3 - Ver todos");
				System.out.println("4 - Asignar técnicx");
				System.out.println("5 - Atras");
				System.out.println("6 - Salir");
				System.out.print("Opción: ");
				opcion = lectura.nextInt();

				switch (opcion) {
				case 1:

					System.out.print("Ingrese el nombre del incidente: ");
					String nombre = lectura.nextLine();

					System.out.print("Ingrese una descripción del incidente: ");
					String descripcion = lectura.nextLine();

					System.out.print("Fecha estimada de resolución: ");
					String fechaPosibleRes = lectura.nextLine();

					System.out.print("Horas estimadas: ");
					int horas = lectura.nextInt();
					
					System.out.print("¿Desea agregar incidentes relacionados?");
					String inc = lectura.nextLine();
								
					if(inc.toUpperCase() == "SI") {
						IncidenteController.mostrarTodos().stream().forEach((incidente)->System.out.println(incidente));
						System.out.print("Id incidente: ");
						idInc = lectura.nextInt();						
					}

					System.out.println("Se creará un incidente con los siguientes datos:");
					System.out.println("Nombre: " + nombre);
					System.out.println("Descripción: " + descripcion);
					System.out.println("Fecha estimada de resolución: " + fechaPosibleRes);					
					System.out.println("Horas estimadas: " + horas);
					if(inc.toUpperCase() == "SI") System.out.println("Id incidente ralacionado: " + idInc); 

					System.out.print("¿Desea confirmar la operación, coloque 1 para continuar o 2 para cancelar?");
					int op = lectura.nextInt();

					if (op != 1 && op != 2) {
						throw new InputMismatchException(
								"La opción ingresada es incorrecta, finalizando el proceso...");
					}

					if (opcion == 1) {
						ic = new IncidenteController(nombre, descripcion, datetime);
						ic.addRelacionado(idInc);
						ic.setHorasEstimadas(horas);
						//ic.setFechaPosibleResolucion(fechaPosibleRes); hay que parsear
						IncidenteController.agregarIncidente(ic);
					} else {
						menuIncidente();
					}
					break;
				case 2:
					
					System.out.print("Id de incidente a resolver: ");
					idInc = lectura.nextInt();	
					
					System.out.println("Consideraciones finales: ");
					String cons = lectura.next();
					
					IncidenteController incidente= IncidenteController.consultarIncidente(idInc);
					System.out.println("¿Confirma que desea resolver el incidente ");

					System.out.println(verIncidente(incidente));

					System.out.println("?");

					System.out.print("1. Continuar");
					System.out.print("2. Cancelar");
					int opBaja = lectura.nextInt();

					if (opBaja != 1 && opBaja != 2) {
						throw new InputMismatchException(
								"La opción ingresada es incorrecta, finalizando el proceso...");
					}

					if (opBaja == 1) {
						incidente.setConsideracionesFinales(cons);
						incidente.setFechaResolucion(LocalDateTime.now());
						IncidenteController.resolver(incidente);
					} else {
						menuIncidente();
					}

					break;
					
				case 3:
				
					IncidenteController.mostrarTodos().stream().forEach((incid)->System.out.println(incid));
					System.out.println();
					System.out.println();
					menuIncidente();
					
					break;
				case 4:
										
					break;
					
				case 5:
					Main.menuPrincipal();
					break;
				case 6:
					System.exit(0);
					break;
				default:
					System.out.println("Opción no válida. Por favor, elija una opción válida.");
				}
			} while (Utility.otro(newQuery));
		} catch (InputMismatchException e) {
			System.out.println("Opción no válida. Por favor, elija una opción válida.");
			lectura.nextLine();
			menuIncidente();
		}
		lectura.nextLine();
	}


	public static String verIncidente(IncidenteController ic) {
		String incidente = "---Detalle de Incidente---\n" + "ID del incidente: " + ic.getId() + "\n" + 
				"Nombre: " + ic.getNombre() + "\n" + "Descripción: " + ic.getDescripcion() + "\n"+
				"Fecha de ingreso: " + ic.getFechaIngreso() + "\n" + 
				"Técnicx que resolvió: "+ic.getTecnicx().getNombre()+"\n" + 
				"Consideraciones finales: " + ic.getConsideracionesFinales() + "\n"+
				"Incidentes relacionados: \n" + ic.getRelacionados().stream().toString() + "\n";
		return incidente;
	}
}
