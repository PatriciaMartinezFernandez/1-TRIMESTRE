package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {

		int numero, max = 0, min;
		int contadorMax = 0;
		int contadorMin = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número:");
		numero = sc.nextInt();
		
		min = numero;
		
		while (numero != 0) {

			if (numero >= max) {
				max = numero;
				contadorMax++;
			}

			else if (numero <= min && numero != 0) {
				
				if (numero == min) {
					contadorMin++;					
				}
				
				min = numero;
			}

			System.out.println("Introduce un número:");
			numero = sc.nextInt();

		}

		System.out.println("El mínimo es " + min + " y aparece " + contadorMin + " veces.");
		System.out.println("El máximo es " + max + " y aparece " + contadorMax + " veces.");

		sc.close();

	}

}
