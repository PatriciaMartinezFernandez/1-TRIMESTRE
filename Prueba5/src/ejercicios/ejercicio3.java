package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	static Scanner sc = new Scanner(System.in);

	public static void imprimirArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] rellenaArrAleatorio(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 49) + 1;
		}

		return arr;
	}

	public static int compruebaRepetidos(int[] apuesta, int[] ganadores) {

		int contadorAciertos = 0;

		for (int i = 0; i < apuesta.length; i++) {
			for (int j = 0; j < ganadores.length; j++) {

				if (apuesta[i] == ganadores[j]) {
					contadorAciertos++;
				}

			}
		}

		return contadorAciertos;
		
	}

	public static void main(String[] args) {

		int[] apuesta = new int[6];
		int cuentaNumeros = 1;
		int numero;

		int[] numerosGanadores = new int[6];
		numerosGanadores = rellenaArrAleatorio(numerosGanadores);

		System.out.println("== PRIMITIVA ==");
		System.out.println("Introduce tus 6 números ganadores: ");

		for (int i = 0; i < apuesta.length; i++) {
			System.out.print("\n" + cuentaNumeros + ") Introduce el numero: ");
			numero = sc.nextInt();
			apuesta[i] = numero;
			cuentaNumeros++;
		}

		System.out.println("\nTus números:");
		imprimirArray(apuesta);

		System.out.println("\nEstos son los números ganadores:");
		imprimirArray(numerosGanadores);
		
		System.out.println("\nNúmeros de aciertos: " + compruebaRepetidos(apuesta, numerosGanadores));
		
		if ( compruebaRepetidos(apuesta, numerosGanadores) == 6) {
			System.out.println("\u001B[32mHAS GANADO!");
		}

	}

}
