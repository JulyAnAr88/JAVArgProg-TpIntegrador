package com.javargprog.controller;

import java.util.Scanner;

public class Utility {

	public static boolean otro(String text) {
		try (Scanner lectura = new Scanner(System.in)) {
			int opcion = 0;
			do {
				System.out.println();
				System.out.println(text);
				System.out.println("1. Sí");
				System.out.println("2. No");
				System.out.print("Opción: ");
				try {
					opcion = lectura.nextInt();
				} catch (NumberFormatException error) {
					otro(text);
				}
			} while (opcion < 1 || opcion > 2);
			return (opcion == 1);
		}
	}
}
