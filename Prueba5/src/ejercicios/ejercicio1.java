package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	static Scanner sc = new Scanner(System.in);

	public static int contadorPalabras(String frase) {

		int contadorPalabra = 1;

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {
				contadorPalabra++;
			}

		}

		return contadorPalabra;

	}

	public static void main(String[] args) {

		String frase;

		System.out.println("Introduce la frase: ");
		frase = sc.nextLine();

		System.out.println("Total de palabras: " + contadorPalabras(frase));

		int longitudPalabra = 0;
		int longitudPalabraMayor = 0;

		// primera palabra
		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) != ' ') {
				longitudPalabra++;
			}

			else
				longitudPalabraMayor = longitudPalabra;
				 
		}

		System.out.println("La palabra más larga es: " );
		System.out.println("Carácteres: " + longitudPalabraMayor);

	}

}
