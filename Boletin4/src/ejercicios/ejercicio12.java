package ejercicios;

import java.util.Scanner;

//  Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.

public class ejercicio12 {

	public static void main(String[] args) {
		
		int nota = 0;
		int contador = 0;
		int contadorSuspenso = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		while (nota >= 0 && contador != 5) {
			
			System.out.println("Escribe la nota (max. 5): ");
			nota = sc.nextInt();
			
			if (nota < 5) {
				contadorSuspenso++;
			}
			
			contador++;
			
		}
		
		System.out.println("Total suspensos: " + contadorSuspenso);
		
		
		sc.close();

	}

}
