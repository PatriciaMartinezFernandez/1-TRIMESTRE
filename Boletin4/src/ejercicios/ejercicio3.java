package ejercicios;

import java.util.Scanner;

// Realizar el juego el número secreto, que consiste en acertar un número desconocido
//(generado aleatoriamente entre 1 y 100). Para ello se leen por teclado una serie de
//números, para los que se indica: «mayor» o «menor», según sea mayor o menor con
//respecto al número secreto. El proceso termina cuando el usuario acierta o cuando se
//rinde (introduciendo un –1).


public class ejercicio3 {

	public static void main(String[] args) {
		
		int numAleatorio= (int) (Math.random()*(-1-101)+101);
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adivina el número del 1-100 (-1 para salir): ");
		numero = sc.nextInt();
		
		while (numero != -1) {
			
			
			if (numero > numAleatorio) {
				System.out.println("El número es menor!");
			}
			
			if (numero < numAleatorio) {
				System.out.println("El número es mayor!");
			}
			
			System.out.println("Adivina el número del 1-100 (-1para salir): ");
			numero = sc.nextInt();
			
			if (numero == numAleatorio) {
				System.out.println("Has ganado! El número era: " + numAleatorio);
				numero = -1;
			}
		}
		
		sc.close();
	}

}
