package ejercicios;

import java.util.Scanner;

// Se desea implementar una aplicación que pida al usuario que introduzca un número
//comprendido entre 1 y 10. Debemos mostrar la tabla de multiplicar de dicho número.
//El código tendrá que asegurarse de que el número introducido se encuentra entre el 1
//y el 10.

public class ejercicio10 {

	public static void main(String[] args) {
		 
		int numero;
		int multiplicacion = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número (1 - 10): ");
		numero = sc.nextInt();

		if (numero <= 10 && numero >= 0) {
			
			System.out.println("==== Tabla de múltiplicar de " + numero + " ====");
			
			for (int i = multiplicacion; i <= 10; i++) {
				multiplicacion = numero * i;
				System.out.println(numero + " * " + i + " = " + multiplicacion);
				
			}
		}
		
		else  { 
			
			System.out.println("Número no válido.");
			
		}
		
		sc.close();
		
	}

}
