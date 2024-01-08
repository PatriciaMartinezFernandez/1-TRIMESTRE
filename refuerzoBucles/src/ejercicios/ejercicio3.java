package ejercicios;

import java.util.Scanner;

// Algoritmo que lea 100 caracteres y nos muestre el número de caracteres leídos que son vocales.


public class ejercicio3 {

	public static void main(String[] args) {

		final String Z = "z";
		boolean entrada_bucle = true;
		int contador_vocales = 0;
		String Respuesta;
		
		Scanner sc = new Scanner(System.in);
		
		while (entrada_bucle != false) {
			
				System.out.println("Introduce número o letra: ");
				Respuesta = sc.next();
				
				if (Respuesta.equals("a")|| Respuesta.equals("e") || Respuesta.equals("i") || Respuesta.equals("o") || Respuesta.equals("u")) {
					contador_vocales++;
				}
				
				if (Respuesta.equals(Z)) {
					entrada_bucle = false;
			}	
		}

		System.out.println("Vocales encontradas: " + contador_vocales);
		
		sc.close();
	}

}
