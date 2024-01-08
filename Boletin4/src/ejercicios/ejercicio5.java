package ejercicios;

import java.util.Scanner;

// Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A
//continuación solicitará por teclado un número que debe estar dentro del rango. Si el
//valor introducido no pertenence al rango, la aplicación volverá a pedir otro valor, y así
//repetidas veces, hasta que el valor se encuentre dentro del rango.


public class ejercicio5 {

	public static void main(String[] args) {

		int minimo;
		int maximo;
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el minino: ");
		minimo = sc.nextInt();
		
		System.out.println("Introduce el maximo: ");
		maximo = sc.nextInt();
		
		System.out.println("Introduce el numero (debe de estar dentro del rango minimo-maximo): ");
		numero = sc.nextInt();
		
		while (numero < minimo || numero > maximo) {
			System.out.println("Está fuera de rango prueba otra vez!");
			System.out.println("Introduce el numero (debe de estar dentro del rango minimo-maximo): ");
			numero = sc.nextInt();
		}
		
		System.out.println("Dentro de rango!");
		
		sc.close();

	}

}
