package ejercicios;

import java.util.Scanner;

// Programa que lea números reales hasta que se introduzca un número negativo y
//muestre la media aritmética de los números reales introducidos (solo valdrán para la media
//aquellos números que no sean negativos). En caso de no introducir ningún número real
//positivo o cero, no se podrá calcular la media y se avisará con un mensaje de error

public class ejercicio6 {

	public static void main(String[] args) {

		double numero, media_aritmetica = 0, sumatorio = 0, contador = 0;
		boolean entrada_bucle = true;
		
		Scanner sc = new Scanner(System.in);
		
		while (entrada_bucle != false) {
			
			System.out.println("Introduce números reales: ");
			numero = sc.nextDouble();
			
			if (numero > 0) {
				contador++;
				sumatorio = sumatorio + numero;
				media_aritmetica = (sumatorio /contador);
			}
			
			if (numero < 0) {
				entrada_bucle = false;
			}
			
		}
		
		System.out.println("Media aritmética: " + media_aritmetica);
		sc.close();

	}

}
