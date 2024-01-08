package ejercicios;

import java.util.Scanner;

/**
 * 2. Escribir un programa que pida dos números (primero y último) y llame a una función a la
 * que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
 */


public class ejercicio2 {

	public static void main(String[] args) {

		int primero, ultimo;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce el primer número: ");
		primero = sc.nextInt();
		
		System.out.print("Introduce el último número: ");
		ultimo = sc.nextInt();
		
		comprendido(primero, ultimo);
		
		sc.close();
	}
	
	public static void comprendido(int num1, int num2) {
		
		for (int i = num1; i <= num2; i++) { 
			System.out.println(i);
		}	
	}

}
