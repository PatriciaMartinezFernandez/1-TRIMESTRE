package ejercicios;

import java.util.Scanner;

/**5. Crear una función que, mediante un booleano, indique si el carácter que se pasa como
parámetro de entrada corresponde con una vocal.
**/

public class ejercicio5 {

	public static boolean vocal(String caracter) {
		
		boolean vocal;
		
		if (caracter.equals("a") || caracter.equals("e") || caracter.equals("i") || caracter.equals("o") || caracter.equals("u") ) {
			vocal = true;
		}
		
		else {
			vocal = false;
		}
		return vocal;
		
	}
	
	public static void main(String[] args) {

		String caracter;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un letra: ");
		caracter = sc.next();
		
		System.out.println("¿Es vocal?: " + vocal(caracter));
		
		sc.close();
		
	}

}
