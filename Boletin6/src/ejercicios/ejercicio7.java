package ejercicios;

import java.util.Scanner;

//Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida

public class ejercicio7 {

	public static String invierteString(String frase) {

		String resultado = "";

		for (int i = frase.length() - 1; i >= 0; i--) {

			resultado += frase.charAt(i);

		}

		return resultado;

	}

	public static void main(String[] args) {

		String frase;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una frase");
		frase = sc.nextLine();

		System.out.println("Frase invertida: " + invierteString(frase));

		sc.close();

	}

}
