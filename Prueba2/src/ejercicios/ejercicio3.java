package ejercicios;

import java.util.Scanner;

/*
 * Realizar un programa para un concesionario que calcule el descuento de un coche
	según su marca y modelo, en base a los siguientes datos:
	● Si la marca es Renault tiene un 15% de descuento.
	● Si la marca es Ford y el modelo es Fiesta tiene un descuento del 7%
	● Si la marca es Ford y el modelo es Focus tiene un descuento del 10%
	● El resto de vehículos solo tienen un descuento del 5%.

 * */

public class ejercicio3 {

	public static void main(String[] args) {
		
		//variables
		int marca, modelo;
		
		//descuentos
		final int DESCUENTO_15 = 15;
		final int DESCUENTO_7 = 7;
		final int DESCUENTO_10 = 1;
		final int DESCUENTO_5 = 5;
		
		Scanner sc = new Scanner(System.in);
		
		//elige marca
		System.out.println("¿Marca del coche? Renault(1) , Ford(2), Otro(3):");
		marca = sc.nextInt();
		
		if (marca == 1) {
			System.out.println("El descuento para esta marca es de: " + DESCUENTO_15 + "%");
		}
		
		if (marca == 2) {
			//elige modelo
			System.out.println("¿Modelo del coche? Fiesta(1) o Focus(2):");
			modelo = sc.nextInt();
				
				if (modelo == 1) {
					System.out.println("El descuento para esta marca y este modelo es de: " + DESCUENTO_7 + "%");
				}
				
				else {
					System.out.println("El descuento para esta marca y este modelo es de: " + DESCUENTO_10 + "%");
				}
			
		}
		
		if (marca == 3) {
			System.out.println("El descuento para esta marca es de: " + DESCUENTO_5 + "%");
		}
		
		sc.close();

	}

}
