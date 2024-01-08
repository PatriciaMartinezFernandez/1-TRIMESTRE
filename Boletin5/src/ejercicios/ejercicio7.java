package ejercicios;

import java.util.Scanner;

/**
 * 7. Implementar la función divisoresPrimos() que muestra, por consola, todos los divisores
 * primos del número que se le pasa como parámetro.
 */

public class ejercicio7 {

	public static int divisoresPrimos(int numero) {

		int contador = 0;
		boolean esPrimo  = true;

		for (int i = 1; i <= numero; i++) {
            esPrimo = true;
            for (int j = 2; j < i; j++) {
                
                if (i % j == 0) {
                    esPrimo = false;
                }
                
            }
            
            if (esPrimo == true && numero % i == 0) {
            	contador++;
            	System.out.println(i + " -> es divisor primo de " + numero);
            }
            
		}
		return contador;
	}	
	
	public static void main(String[] args) {

		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		numero = sc.nextInt();
		
		System.out.println("\n" + numero + " tiene un total de " + divisoresPrimos(numero) + " divisores primos");
		
		sc.close();
		

	}

}
