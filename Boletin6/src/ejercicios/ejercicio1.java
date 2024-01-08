package ejercicios;

import java.util.Scanner;

/**
 * . Introducir por teclado dos palabras e indicar cuál de ellas es la más
 * corta, es decir, la que contiene menos caracteres.
 */

public class ejercicio1 {

	public static void main(String[] args) {

		String Palabra1, Palabra2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce la primera palabra: ");
		Palabra1 = sc.next();

		System.out.println("Introduce la segunda palabra: ");
		Palabra2 = sc.next();

		if (Palabra1.length() > Palabra2.length())
			System.out.println(Palabra1 + " porque tiene " + Palabra1.length() + " caracteres.");

		else
			System.out.println(Palabra2 + " porque tiene " + Palabra2.length() + " caracteres.");

		sc.close();

	}

}
