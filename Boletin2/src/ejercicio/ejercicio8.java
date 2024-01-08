package ejercicio;

import java.util.Scanner;

public class ejercicio8 {
	public static void main(String[] args) {
		
		float numeroD;
		
		Scanner sc = new Scanner(System.in);
		
		//Entrada numero decimal
		System.out.println("Escribe un número con decimales:");
		numeroD = sc.nextFloat();		
		
		System.out.println("El número entero más próximo de " + numeroD + " es: " + Math.round(numeroD));
		
		sc.close();
	}
}


