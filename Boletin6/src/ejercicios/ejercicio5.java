package ejercicios;

import java.util.Scanner;

/*Escribir un programa que permita partir un número introducido por teclado en dos partes.
Las posiciones se cuentan de izquierda a derecha empezando por el 1. Suponemos que el
usuario introduce correctamente los datos, es decir, el número introducido tiene dos dígitos
como mínimo y la posición en la que se parte el número está entre 2 y la longitud del
número.
*/

public class ejercicio5 {

	public static void partido(String numero, int posicion) {

		String parte1 = "0", parte2 = "0";

		for (int i = 1; i < numero.length(); i++) {

			if (i == posicion) {
				parte1 = numero.substring(0, posicion);
				parte2 = numero.substring(posicion);

				System.out.println("Los números partidos son el " + parte1 + " y " + parte2);
			}

		}
	}

	public static void main(String[] args) {

		String num;
		int posicion;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entero positivo: ");
		num = sc.nextLine();

		System.out.println("Introduce la posición a partir el número: ");
		posicion = sc.nextInt();

		partido(num, posicion);

		sc.close();

	}

}
