package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void insertaNum(String numero, int posicion, int insertado) {

		String parte1 = "0", parte2 = "0";

		for (int i = 1; i < numero.length(); i++) {

			if (i == posicion) {
				parte1 = numero.substring(0, posicion);
				parte2 = numero.substring(posicion);

				System.out.println("El numero resultante es  " + parte1 + "" + insertado + "" + parte2);
			}

		}
	}

	public static void main(String[] args) {

		String num;
		int posicion, insertado;

		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número entero positivo: ");
		num = sc.nextLine();

		System.out.println("Introduce la posición donde quiere insertar: ");
		posicion = sc.nextInt();
		
		System.out.println("Introduce el dígito que quieres insertar: ");
		insertado = sc.nextInt();

		insertaNum(num, posicion, insertado);

		sc.close();

	}

}

