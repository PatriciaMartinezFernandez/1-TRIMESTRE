package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		int numAleatorio= (int) (Math.random()*(1-10)+10);
		int numUsuario;
		boolean acierto = false;
		int contador = 1;
		
		Scanner sc = new Scanner(System.in);
				
		while (acierto == false) {
			
			System.out.println("Adivina el número, escribe tu número: ");
			numUsuario = sc.nextInt();
			
			if (numUsuario == numAleatorio) {
				System.out.println("Has ganado! El número era: " + numAleatorio);
				System.out.println("Intentos: " + contador);
				acierto = true;
			}
			else if (numUsuario > numAleatorio) {
				System.out.println(numUsuario + " no es, prueba con un número menor!");
				contador++;
			}
			
			else {
				System.out.println(numUsuario + " no es, prueba con un número mayor!");
				contador++;
			}
		}	
		
		sc.close();
		
	}
}
