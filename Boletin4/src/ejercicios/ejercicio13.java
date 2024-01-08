package ejercicios;

import java.util.Scanner;

// Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.


public class ejercicio13 {

	public static void main(String[] args) {
		
		int nota = 0;
		int contador = 0;
		int contadorSuspenso = 0;
		int contadorCondicionado = 0;
		int contadorAprobado = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		while (nota >= 0 && contador != 6) {
			
			System.out.println("Escribe la nota (max. 6): ");
			nota = sc.nextInt();
			
			if (nota >= 5) {
				contadorAprobado++;
			}
			
			else if (nota == 4) {
				contadorCondicionado++;
			}
			
			else if (nota < 4) {
				contadorSuspenso++;
			}
			
			contador++;
			
		}
		
		System.out.println("Total aprobados: " + contadorAprobado);
		System.out.println("Total condicionados: " + contadorCondicionado);
		System.out.println("Total suspensos: " + contadorSuspenso);
		
		
		sc.close();

	}

}
