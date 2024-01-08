package ejercicios;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		//Escribir una aplicación que indique cuántas cifras tiene un número entero introducido
		//por teclado, que estará comprendido entre 0 y 99.999
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Introduce un número del 1-99:");
		numero = sc.nextInt();
		
		if (numero < 10) {
			System.out.println("El número " + numero + " tiene 1 cifra");
		}
		
		else if (numero > 10 && (numero < 100))  {
			System.out.println("El número " + numero + " tiene 2 cifras");
		}
		
		else {
			System.out.println("Ese número está fuera del rango");
		}
		
		sc.close();
	}

}
