package ejercicios;

import java.util.Scanner;

//Diseñar un programa que solicite al usuario una frase y una palabra. A continuación buscará cuántas veces aparece la palabra en la frase.

public class ejercicio8 {

	public static int contadorPalabra(String frase, String palabra) {
		
		int contadorPalabra = 0;
		
		while (frase.indexOf(palabra) > -1) {
			
			frase = frase.substring(frase.indexOf(palabra) + palabra.length(),frase.length());
			contadorPalabra++;
		}
		
		return contadorPalabra;
		
	}
	
	public static void main(String[] args) {

		String palabra, frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase ");
		frase = sc.nextLine();
		
		System.out.println("Introduce una palabra: ");
		palabra = sc.nextLine();
		
		System.out.println("¿Cuántas veces se ha repetido la palabra?: " + contadorPalabra(frase, palabra));
		
		sc.close();

	}

}
