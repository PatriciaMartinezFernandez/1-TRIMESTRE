package ejercicios;

import java.util.Scanner;

// Algoritmo que suma independientemente los números pares e impares comprendidos
//entre 25 y 50, y muestra por pantalla el resultado de las sumas. (hacer con while y con for)

public class ejercicio7 {

	public static void main(String[] args) {
		
		int numero = 0, sumatorio_par = 0, sumatorio_impar = 0;
		boolean entrada_bucle = true;
		
		Scanner sc = new Scanner(System.in);
		
		while (entrada_bucle != false) {
			
			System.out.println("Sumar pares e impares (25-50, puedes salir escribiendo un numero fuera del rango)");
			numero = sc.nextInt();
			
			if (numero < 25 || numero > 50) {
				entrada_bucle = false;
			}
			
			if (numero % 2 == 0 && (numero >= 25 && numero <= 50)) {
				sumatorio_par = sumatorio_par + numero;
			}
			
			if (numero % 2 != 0 && (numero >= 25 && numero <= 50)) {
				sumatorio_impar = sumatorio_impar + numero;
			}
		
		}
		
			System.out.println("Sumatorio pares: " + sumatorio_par);
			System.out.println("Sumatorio impares: " + sumatorio_impar);
		
		sc.close();

	}

}
