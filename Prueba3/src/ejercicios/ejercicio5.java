package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	//hace el factorial de n
	public static void factorial(int numero) {

		int factorial = 1;

		for (int i = numero; i > 0; i--) {

			factorial = factorial * i;
		}

		System.out.println(factorial);

	}

	public static void main(String[] args) {

		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un número:");
		numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("Numero no valido, tiene que ser positivo");
		}

		else {
			System.out.print("Resultado: ");
			factorial(numero);
		}

		sc.close();
	}
}
