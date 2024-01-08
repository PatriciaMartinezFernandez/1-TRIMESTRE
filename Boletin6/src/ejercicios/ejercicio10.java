package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static String invierteString(String frase) {

		String resultado = "";

		for (int i = frase.length() - 1; i >= 0; i--) {

			resultado += frase.charAt(i);

		}

		return resultado;

	}

	public static void esPalindroma(String frase) {

		frase = frase.toLowerCase();
		char espacio = ' ';
		String sinEspacios = "";

		for (int i = 0; i < frase.length(); i++) {

			if (frase.charAt(i) != espacio) {
				sinEspacios += frase.charAt(i);
			}

		}

		String invertida = invierteString(sinEspacios.toLowerCase());

		if (sinEspacios.equals(invertida)) {
			System.out.println("Es palíndroma");
		}

		else {
			System.out.println("No es palíndroma");
		}

	}

	public static void main(String[] args) {

		String frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu nombre y tus apellidos: ");
		frase = sc.nextLine();

		esPalindroma(frase);

		sc.close();

	}

}
