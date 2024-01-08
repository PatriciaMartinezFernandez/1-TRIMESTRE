package ejercicios;

import java.util.Scanner;

//Leer 2 números enteros y positivos: Base y Exponente, y calcular la Base elevado al
//exponente. Nota: no usar la clase Math
//Ejemplo:
//si base = 7 y exponente es 3 => resultado = 7 * 7 * 7
//si base = 8 y exponente es 5 => resultado = 8 * 8 * 8 * 8 * 8

public class ejercicio8 {

	public static void main(String[] args) {
		
		int base, exponente;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe la base: ");
		base = sc.nextInt();
		
		System.out.println("Escribe el exponente: ");
		exponente = sc.nextInt();
		
		for (int i = 1; i < exponente;i++) {
			System.out.print(base + " * ");
			}
			
		System.out.println(base);
		sc.close();
	}
		
}
