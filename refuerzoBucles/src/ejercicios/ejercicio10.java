package ejercicios;

import java.util.Scanner;

// Realizar un algoritmo que lea un número entero positivo N y calcule y muestre la suma
//de los N primeros números múltiplos de 3

public class ejercicio10 {

	public static void main(String[] args) {
		
		int numero, calculo = 0, mastres = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		for (int i = 1; i <= numero ; i++ ) {
			mastres = mastres + 3;
			System.out.println(mastres);
			calculo	= calculo + mastres;
		}
		
		System.out.println("Resultado: " + calculo);
		
		sc.close();

	}

}
