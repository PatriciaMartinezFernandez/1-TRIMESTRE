package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	// Diseñar una aplicación que solicite al usuario un número e indique si es par o impar

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroRespuesta;
		
		System.out.println("Por favor, introduce un número");
		numeroRespuesta = sc.nextInt();
		
		if (numeroRespuesta % 2 == 0) {
			System.out.println(numeroRespuesta + " es par");
			} 
		
		else {
			System.out.println(numeroRespuesta + " no es par");
			}
		
		sc.close();
	}
}
