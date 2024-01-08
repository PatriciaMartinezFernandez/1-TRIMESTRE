package ejercicios;

import java.util.Scanner;

//Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará
//todos los números del 1 a n.

public class ejercicio4 {

	public static void main(String[] args) {
		
		int numero;
		int i;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un número: ");
		numero = sc.nextInt();
		
		for (i = 1; i < numero+1; i += 1) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
