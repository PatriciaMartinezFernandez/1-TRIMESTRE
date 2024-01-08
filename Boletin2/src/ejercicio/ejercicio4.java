package ejercicio;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		int anioActual;
		int anioNacimiento;
		
		Scanner sc = new Scanner(System.in);
		
		//Entrada año
		System.out.println("¿En qué años estamos?");
		anioActual = sc.nextInt();
		
		//Entrada edad
		System.out.println("¿En qué año naciste?");
		anioNacimiento = sc.nextInt();
				
		int edad = anioActual - anioNacimiento;
		
		System.out.println("Si estamos en " + anioActual + " y naciste en " + anioNacimiento + " tienes " + edad + " años");
	
		sc.close();
	}
}
