package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	// suma los numeros pares e impares
	public static void suma(int numero) {

		int sumaPares = 0, sumaImpares = 0;

		for (int i = 1; numero > i; i++) {
			if (i % 2 == 0) {
				sumaPares += i;
			} else {
				sumaImpares += i;
			}
		}

		System.out.println("Sumatorio par de " + numero + ": " + sumaPares);
		System.out.println("Sumatorio impar de " + numero + ": " + sumaImpares);
	}

	// multiplica los numeros pares e impares
	public static void multiplicacion(int numero) {

		int multiplicacionPar = 1, multiplicacionImpar = 1;

		for (int i = 1; numero > i; i++) {
			if (i % 2 == 0) {
				multiplicacionPar *= i;
			} else {
				multiplicacionImpar *= i;
			}
		}
		
		System.out.println("Multiplicacion par de " + numero + ": " + multiplicacionPar);
		System.out.println("Multiplicacion impar de " + numero + ": " + multiplicacionImpar);

	}

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un número: ");
		num = sc.nextInt();

		suma(num);
		multiplicacion(num);

		sc.close();

	}

}
