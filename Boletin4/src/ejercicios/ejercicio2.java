package ejercicios;

import java.util.Scanner;

// Un centro educativo nos ha pedido que diseñemos una aplicación para calcular algunos
//datos estadísticos de las edades de los alumnos. Se introducirán datos hasta que uno
//de ellas sea negativo. La aplicación mostrará la suma de todas las edades, la media,
//de cuántos alumnos hemos introducido las edades y cuántos alumnos son mayores de
//edad. Implementar la aplicación requerida.


public class ejercicio2 {

	public static void main(String[] args) {
		 
		int edad;
		int sumatorio = 0;
		int media = 0;
		int contador = 0;
		int contadorMayorEdad = 0;
		final int MAYOR_EDAD = 18;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu edad (numero negativo para salir):");
		edad = sc.nextInt();
		
		while (edad > 0) {
			
			if (edad >= MAYOR_EDAD) {
				contadorMayorEdad++;
			}
			
			contador++;
			sumatorio = sumatorio + edad;
			media = sumatorio / contador;
			
			System.out.println("Escribe tu edad (numero negativo para salir):");
			edad = sc.nextInt();
		}
		
		System.out.println("Sumatorio edades: " + sumatorio);
		System.out.println("Media edades: " + media);
		System.out.println("De ellos mayores de edad: " + contadorMayorEdad);
		
		sc.close();
		
	}
}
