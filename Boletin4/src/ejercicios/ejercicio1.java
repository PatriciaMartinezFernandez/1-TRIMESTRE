package ejercicios;

import java.util.Scanner;

//Diseñar un programa que muestre, para cada número introducido por teclado, si es par,
//si es positivo y su cuadrado. El proceso se repetirá hasta que el número introducido
//por teclado sea 0.


public class ejercicio1 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número (0 para salir): ");
		numero = sc.nextInt();
		
		while (numero != 0) {
			
			if (numero > 0) {
				System.out.println(numero + " es positivo");
			}
			
			if (numero % 2 == 0) {
				System.out.println(numero + " es par");
			}
			
			System.out.println("El cuadrado de " + numero + " es " + numero * numero );
			
			System.out.println("Introduce un número (0 para salir): ");
			numero = sc.nextInt();
		}
		
		System.out.println("Fin");
		
		sc.close();

	}
}
