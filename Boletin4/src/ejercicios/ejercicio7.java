package ejercicios;

import java.util.Scanner;

//Diseñar un programa que muestre el producto de los 10 primeros números impares

public class ejercicio7 {

	public static void main(String[] args) {
		
		int numero;
		int producto = 1;
		boolean entrada = false;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número (solo va a coger los 10 primeros numeros impares): ");
		numero = sc.nextInt();
		
		while (entrada == false) {
			
			if (numero % 2 != 0) {
				producto = producto * numero;
				contador++;
			}
			
			if (contador == 10) {
				entrada = true;
			}
			
			System.out.println("Introduce otro número: ");
			numero = sc.nextInt();
		
		}
		
		System.out.println("Producto de los 10 primeros números impares: " + producto);
		
		sc.close();

	}

}
