package ejercicios;

import java.util.Scanner;

/*
 * Escribe un programa que muestre por pantalla todos los números enteros positivos
	menores a uno leído por teclado que no sean divisibles entre otro también leído de
	igual forma
 * */

public class ejercicio4 {

	public static void main(String[] args) {

		//variables
		int numero, divisor;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		numero = sc.nextInt();
		
		System.out.println("Introduce el divisor:");
		divisor = sc.nextInt();
		
		//bucle que hace un listado de números de la variable numero hasta 1
		for (int i = 1; i <= numero; i++) {
			//de ese listado de números comprueba cuales NO son divisbles entre la variable divisor
			if (i % divisor != 0) {
				//solo printea en caso de que no sean divisibles
				System.out.println(i);
			}
		}
		
		
		sc.close();

	}

}
