package ejercicios;

import java.util.Scanner;

// Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se denota 5! y
//es igual a 5 × 4 × 3 × 2 × 1 = 120.


public class ejercicio8 {

	public static void main(String[] args) {

		int numero;
		int i;
		int factorial = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcular número factorial de: ");
		numero = sc.nextInt();
		
		for (i = factorial; i <= numero; i++) {
			factorial = factorial * i;
		}
		
		System.out.println(numero + "! es " + factorial);
		
		sc.close();
	}

}
