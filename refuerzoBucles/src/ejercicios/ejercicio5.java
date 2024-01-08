package ejercicios;

import java.util.Scanner;

// Algoritmo que calcula y escribe la suma y el producto de los 7 primeros números naturales.


public class ejercicio5 {

	public static void main(String[] args) {
		
		int numero = 0, suma = 0, producto = 1, contador = 0;
		boolean entrada_bucle = true;
		
		Scanner sc = new Scanner(System.in);
		
		while (entrada_bucle != false) {
			
			contador++;
			
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			
			suma = suma + numero;
			producto = producto * numero;
			
			if (numero < 0) {
				System.out.println("Ese número no es natural. Fin.");
				entrada_bucle = false;
			}
			
			if (contador == 7) {
				entrada_bucle = false;
			}
			
		}
		
		if (numero >= 0) {
			System.out.println("Sumatorio: " + suma);
			System.out.println("Producto: " + producto);
		}
		sc.close();

	}

}
