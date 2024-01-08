package ejercicios;

import java.util.Scanner;

//Algoritmo que lea 10 números enteros y muestre por pantalla cuántos de ellos son
//positivos, negativos o nulos y cuántos son pares o impares.

public class ejercicio4 {

	public static void main(String[] args) {

		final int DIEZ = 10;
		boolean entrada_bucle = true;
		int contador_positivo = 0;
		int contador_negativo = 0;
		int contador_nulo = 0;
		int contador_par = 0;
		int contador_impar = 0;
		int respuesta;
		int contador_respuestas = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (entrada_bucle != false) {
			
				contador_respuestas++;
				System.out.println("Introduce número entero, positivo, negativo, nulo, par o impar: ");
				respuesta = sc.nextInt();
				
				if ( respuesta > 0) {
					System.out.println("-> Número positivo");
					contador_positivo++;
				}
				
				if ( respuesta < 0) {
					System.out.println("-> Número negativo");
					contador_negativo++;
				}
				
				if ( respuesta == 0) {
					System.out.println("-> Número nulo");
					contador_nulo++;
				}
				
				if ( respuesta % 2 == 0) {
					System.out.println("-> Número par");
					contador_par++;
				}
				
				if ( respuesta % 2 != 0) {
					System.out.println("-> Número impar");
					contador_impar++;
				}
				
				if (contador_respuestas == DIEZ) {
					entrada_bucle = false;
			}	
		}

		System.out.println("====================================");
		System.out.println("Positivos encontrados: " + contador_positivo);
		System.out.println("Negavitos encontrados: " + contador_negativo);
		System.out.println("Nulos encontrados: " + contador_nulo);
		System.out.println("Pares encontrados: " + contador_par);
		System.out.println("Impares encontrados: " + contador_impar);
		
		sc.close();
	}

}

