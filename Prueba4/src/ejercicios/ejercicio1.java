package ejercicios;

import java.util.Scanner;

/**
 * Haz un programa, utilizando arrays, que permite leer 10 números enteros hasta
 * que el número introducido sea 0. A continuación mostrará por pantalla la
 * media de los números negativos y de los números positivos introducidos.
 **/

public class ejercicio1 {

	//metodo que me imprime arrays
	public static void imprimirArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();
	}

	public static void main(String[] args) {

		double[] numeros = new double[10];

		double numero, totalPositivo = 0, totalNegativo = 0;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 10 números:\n");

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número: ");
			numero = sc.nextDouble();

			if (numero == 0) {
				break;
			}

			else if (numero > 0) {

				totalPositivo += numero;
			}

			else {
				totalNegativo -= numero;
			}

			numeros[i] = numero;
		}

		double mediaPositiva = totalPositivo / numeros.length, mediaNegativa = totalNegativo / numeros.length;

		System.out.println("\nMedia positiva: " + mediaPositiva);
		System.out.println("Media negativa: " + mediaNegativa);

		sc.close();

	}

}
