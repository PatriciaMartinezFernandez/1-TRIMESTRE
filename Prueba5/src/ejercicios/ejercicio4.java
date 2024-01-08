package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

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

		final int TOTAL_APUESTAS = 8;
		int numeroApuesta = 0;
		boolean jugar = true;
		String yn;
		
		

		while (jugar != false) {

			System.out.println("== PRIMITIVA ==");
			System.out.println("Introduce tus 6 números ganadores: ");

			for (int i = 0; i < apuesta.length; i++) {
				cuentaNumeros = 1;
				System.out.print("\n" + cuentaNumeros + ") Introduce el numero: ");
				numero = sc.nextInt();
				apuesta[i] = numero;
				cuentaNumeros++;
			}

			System.out.println("\nTus números de la " + (numeroApuesta+1) + "º apuesta:");
			imprimirArray(apuesta);

			System.out.println("\nEstos son los números ganadores:");
			imprimirArray(numerosGanadores);

			System.out.println("\nNúmero de aciertos de " + (numeroApuesta+1) + "º apuesta: " + compruebaRepetidos(apuesta, numerosGanadores));
			numeroApuesta++;

			System.out.println("¿Quieres hacer otra apuesta? Y/N");
			yn = sc.next();

			if (yn.toLowerCase().equals("n")) {
				jugar = false;
			}
			
			if (numeroApuesta == TOTAL_APUESTAS) {
				
				System.out.println("No puedes seguir apostando, has llegado al total de apuestas permitidas!");
				jugar = false;
				
			}
		}

	}

}
