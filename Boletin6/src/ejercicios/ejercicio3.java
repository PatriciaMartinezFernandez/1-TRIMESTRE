package ejercicios;

import java.util.Scanner;

/*Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es o no un espacio.
 *nota: si la longitud es par considerar la posición de (longitud/2) -1.
*/

public class ejercicio3 {

	public static boolean esEspacio(String frase) {

		boolean esEspacio = false;

			if ((frase.length() % 2 == 0) && (frase.charAt(frase.length() / 2 - 1) == ' ')){
				esEspacio = true;
			}
			
			else if ((frase.length() % 2 != 0) && (frase.charAt(frase.length() / 2 ) == ' ')) {
				esEspacio = true;
			}

		return esEspacio;

	}

	public static void main(String[] args) {

		String frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase: ");
		frase = sc.nextLine();

		System.out.println("La posición central es un espacio? " + esEspacio(frase));
		
		sc.close();

	}

}
