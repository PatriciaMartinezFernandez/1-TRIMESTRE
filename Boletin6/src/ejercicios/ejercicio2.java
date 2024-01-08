package ejercicios;

import java.util.Scanner;

/**
 * Diseñar una aplicación que pida al usuario que introduzca una frase por
 * teclado e indique cuántos espacios en blanco tiene.
 **/

public class ejercicio2 {

	public static int cuentaEspacios(String frase) {

		int contadorEspacios = 0;

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {
				contadorEspacios++;
			}

		}
		
		return contadorEspacios;

	}

	public static void main(String[] args) {

		String frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();

		System.out.println("Total de espacios: " + cuentaEspacios(frase));
		
		sc.close();

	}

}
