package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void cuentaPalabrasA(String frase) {

		frase = frase.toLowerCase();

		int contadorPalabras = 1;
		int contadorA = 0;

		if (frase.charAt(0) == 'a') {
			contadorA++;
		}

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) == ' ') {
				contadorPalabras++;

				if (frase.charAt(i + 1) == 'a') {
					contadorA++;
				}
			}

		}

		System.out.println("Esta frase tiene " + contadorPalabras + " palabras");
		System.out.println("Total de palabras que empiezan por a/A: " + contadorA);

	}

	public static void main(String[] args) {

		String frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una frase: ");
		frase = sc.nextLine();

		cuentaPalabrasA(frase);

		sc.close();

	}

}
