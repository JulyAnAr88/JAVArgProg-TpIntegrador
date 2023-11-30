package com.javargprog;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.javargprog.controller.IncidenteController;
import com.javargprog.controller.Utility;
import com.javargprog.view.ClienteView;
import com.javargprog.view.IncidenteView;
import com.javargprog.view.LlamadaView;
import com.javargprog.view.ReportesView;

/**
 * 
 *
 */
public class Main 
{
    public static void main( String[] args )
    {    	    	
        System.out.println( "---- Sistema de gestión de incidentes ----" );
        menuPrincipal();                
    }
    
    public static void menuPrincipal(){
    	Scanner lectura = new Scanner(System.in);
        try {
            int opcion;
            do {
                System.out.println();
                System.out.println("------ Menú de ingreso ------");
                System.out.println("1. Mesa de Ayuda");
                System.out.println("2. Área Comercial");
                System.out.println("3. RR HH");
                System.out.println("4. Salir");

                System.out.print("Opción: ");
                opcion = lectura.nextInt();

                switch (opcion) {
                    case 1:
                        menuMesaDeAyuda();
                        break;
                    case 2:
                        menuAreaComercial();
                        break;
                    case 3:
                       menuRecursosHumanos();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción válida.");
                }
            } while (opcion < 1 || opcion > 4);
        }catch (InputMismatchException e){
            lectura.nextLine();
            System.out.println("Opción no válida. Por favor, elija una opción válida.");
            menuPrincipal();
        }
        lectura.close();
    }
    
    private static void menuRecursosHumanos() {
    	try (Scanner lectura = new Scanner(System.in)) {
			int opcion;
			try{
			do {
			    System.out.println();
			    System.out.println("--- RRHH ------------");
			    System.out.println("1 - Nuevx Técnicx");
			    System.out.println("2 - Gestionar Técnicx");
			    System.out.println("3 - Reportería");
			    System.out.println("4 - Menu Principal");
			    System.out.println("5 - Salir");
			    System.out.print("Opción: ");
			    opcion = lectura.nextInt();

			    switch (opcion) {
			        case 1:
			            
			            break;
			        case 2:
			            
			            break;
			        case 3:
			        	ReportesView.menuReportes();
			        	break;
			        case 4:
			            menuPrincipal();
			            break;
			        case 5:
			            System.exit(0);
			            break;
			        default:
			            System.out.println("Opción no válida. Por favor, elija una opción válida.");
			    }
			}while (Utility.otro("RRHH: ¿Desea realizar otra accion?"));
			} catch (InputMismatchException errorFormato) {
			    System.out.println("Formato incorrecto. Utilice números");
			    lectura.next();
			}
			lectura.nextLine();
		}
		
	}

	private static void menuAreaComercial() {
		try (Scanner lectura = new Scanner(System.in)) {
			int opcion;
			try{
			do {
			    System.out.println();
			    System.out.println("--- Área comercial ---");
			    System.out.println("1 - Gestionar Clientes");
			    System.out.println("2 - Menu Principal");
			    System.out.println("3 - Salir");
			    System.out.print("Opción: ");
			    opcion = lectura.nextInt();

			    switch (opcion) {
			        case 1:
			            ClienteView.menuCliente();
			            break;
			        case 2:
			            menuPrincipal();
			            break;
			        case 3:
			            System.exit(0);
			            break;
			        default:
			            System.out.println("Opción no válida. Por favor, elija una opción válida.");
			    }
			}while (Utility.otro("Área comercial: ¿Desea realizar otra acción?"));
			} catch (InputMismatchException errorFormato) {
			    System.out.println("Formato incorrecto. Utilice números");
			    lectura.next();
			}
			lectura.nextLine();
		}
		
	}

	public static void menuMesaDeAyuda() {
		try (Scanner lectura = new Scanner(System.in)) {
			int opcion;
			try{
			do {
			    System.out.println();
			    System.out.println("--- Mesa de ayuda ------");
			    System.out.println("1 - Registrar llamada");
			    System.out.println("2 - Gestionar incidentes");
			    System.out.println("3 - Menu Principal");
			    System.out.println("4 - Salir");
			    System.out.print("Opción: ");
			    opcion = lectura.nextInt();

			    switch (opcion) {
			        case 1:
			            
			        	LlamadaView.menuLlamada();
			            
			            break;
			        case 2:
			        	
			        	IncidenteView.menuIncidente();
			        	System.out.println("Seleccione el id de un incidente de la siguiente lista: ");	
						/*IncidenteController incidentesGestion = incidentes.stream().filter((incidente)->
						!servicio.isBaja()).collect(Collectors.toList());*/
						
						IncidenteController.mostrarTodos();
						int atrInc = lectura.nextInt();
						
						IncidenteController.gestionarIncidente(atrInc);
			            break;
			        case 3:
			            menuPrincipal();
			            break;
			        case 4:
			            System.exit(0);
			            break;
			        default:
			            System.out.println("Opción no válida. Por favor, elija una opción válida.");
			    }
			}while (Utility.otro("Mesa de ayuda: ¿Desea realizar otra acción?"));
			} catch (InputMismatchException errorFormato) {
			    System.out.println("Formato incorrecto. Utilice números");
			    lectura.next();
			}
			lectura.nextLine();
		}
		
    }

}
