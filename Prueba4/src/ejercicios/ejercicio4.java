package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {

		int[] alfabeto = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
				25 };

		String frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe tu frase: ");
		frase = sc.nextLine();

		char[] letrasFrase = new char[frase.length()];

		int contadores[] = new int[frase.length()];

		for (int i = 0; i < frase.length(); i++) {

			letrasFrase[i] = frase.charAt(i);

			for (int j = 0; j < alfabeto.length; j++) {

				if (Character.getNumericValue(letrasFrase[i]) == alfabeto[j]) {
					contadores[i]++;
				}

			}

			System.out.println("Letra " + letrasFrase[i] + ": " + contadores[i]);

		}

		sc.close();

	}
}