package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
	
	public static void main(String[] args) {
		//Pedir dos números enteros y decir si son iguales o si son distintos cuál es mayor
		
		Scanner sc = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Por favor, introduce el primer número:");
		numero1 = sc.nextInt();
		
		System.out.println("Por favor, introduce el segundo número:");
		numero2 = sc.nextInt();
		
		if (numero1 == numero2) {
			System.out.println("Los números son iguales");
		}
		
		else {
			System.out.println("Los número no son iguales");
		}
		
		sc.close();
	}
}
