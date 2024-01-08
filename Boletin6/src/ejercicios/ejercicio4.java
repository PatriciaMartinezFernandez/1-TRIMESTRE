package ejercicios;

import java.util.Scanner;

/**
 * Escribir un programa que inserte “<>” justo en la mitad de una cadena de
 * caracteresdes de el teclado.
 **/

public class ejercicio4 {

	public static String insertaComillas(String cadena) {

		int mitad = cadena.length() / 2;
		
        String resultado = cadena.substring(0, mitad) + "<>" + cadena.substring(mitad);
        
        return resultado;
	}

	public static void main(String[] args) {

		String cadena;

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe una cadena de caracteres: ");
		cadena = sc.nextLine();
		
		System.out.println(insertaComillas(cadena));

		sc.close();

	}

}
