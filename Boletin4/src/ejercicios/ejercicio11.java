package ejercicios;

import java.util.Scanner;

// Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.


public class ejercicio11 {

	public static void main(String[] args) {
		
		int numero;
		int multiplicacion = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tablas de multiplicar del 1 al 10, elige una tabla: ");
		numero = sc.nextInt();
		
		switch (numero) {
		case 1: 
			for (int i = multiplicacion; i <= 10; i++) {
				multiplicacion = numero * i;
				System.out.println(numero + " * " + i + " = " + multiplicacion);
			}
			break;
			
		case 2:
			for (int i = multiplicacion; i <= 10; i++) {
				multiplicacion = numero * i;
				System.out.println(numero + " * " + i + " = " + multiplicacion);
				
			}
			break;
			
		case 3:
			for (int i = multiplicacion; i <= 10; i++) {
				multiplicacion = numero * i;
				System.out.println(numero + " * " + i + " = " + multiplicacion);
				
			}
			break;
			
		case 4:
			for (int i = multiplicacion; i <= 10; i++) {
				multiplicacion = numero * i;
				System.out.println(numero + " * " + i + " = " + multiplicacion);
				
			}
			break;
			
		case 5:
			for (int i = multiplicacion; i <= 10; i++) {
				multiplicacion = numero * i;
				System.out.println(numero + " * " + i + " = " + multiplicacion);
				
			}
			break;
			
		case 6:
			for (int i = multiplicacion; i <= 10; i++) {
				multiplicacion = numero * i;
				System.out.println(numero + " * " + i + " = " + multiplicacion);
				
			}
			break;
			
		case 7:
			for (int i = multiplicacion; i <= 10; i++) {
				multiplicacion = numero * i;
				System.out.println(numero + " * " + i + " = " + multiplicacion);
				
			}
			break;
			
		case 8:
			for (int i = multiplicacion; i <= 10; i++) {
				multiplicacion = numero * i;
				System.out.println(numero + " * " + i + " = " + multiplicacion);
				
			}
			break;
			
		case 9:
			for (int i = multiplicacion; i <= 10; i++) {
				multiplicacion = numero * i;
				System.out.println(numero + " * " + i + " = " + multiplicacion);
				
			}
			break;
			
		case 10:
			for (int i = multiplicacion; i <= 10; i++) {
				multiplicacion = numero * i;
				System.out.println(numero + " * " + i + " = " + multiplicacion);
				
			}
			break;
		}
		
		sc.close();
	}

}
