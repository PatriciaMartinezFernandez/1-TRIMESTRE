package ejercicios;

import java.util.Scanner;

/**10. Diseñar una función que calcule el n-ésimo término de la serie de Fibonacci. En esta
serie el n-ésimo valor se calcula sumando los dos valores anteriores. Es decir:
fibonacci(n) = fibonacci(n − 1) + fibonacci(n − 2)
fibonacci(0) = 1
fibonacci(1) = 1
**/

public class ejercicio10 {

	public static int fibonacci(int numero) {
	
		int fibonacci = 1;
		int resultado = 1;
		
		if (numero == 0 || numero == 1) {
			
			return 1;
		}
		
		else {
			resultado = (fibonacci(numero - 1)) + (fibonacci(numero -2));
			
			return resultado;
		}	
	}
	
	public static void main(String[] args) {

		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		System.out.println("Fibonacci es: " + fibonacci(numero));
		
		sc.close();
	
	}

}
