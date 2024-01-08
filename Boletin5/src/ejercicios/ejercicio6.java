package ejercicios;

import java.util.Scanner;

/*
 * 6. Escribir una función a la que se le pase un número entero y devuelva el número de
 * divisores primos que tiene.
 */

public class ejercicio6 {

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
            }
            
		}
		return contador;
	}

    public static void main(String[] args) {
        int numero;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        numero = sc.nextInt();
        
        System.out.println("Tiene " + divisoresPrimos(numero) + " divisores primos.");
        
        sc.close();
    }
}