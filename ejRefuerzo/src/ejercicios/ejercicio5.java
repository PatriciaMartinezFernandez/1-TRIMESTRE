package ejercicios;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		int numeroHormigas;
		final int PATAHORMIGA = 6;
		int numeroAranias;
		final int PATAARANIA = 8;
		int numeroCochinillas;
		final int PATACOCHINILLA = 6;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántas hormigas has capturado?");
		numeroHormigas = sc.nextInt();
		
		int totalHormigas = numeroHormigas * PATAHORMIGA;
		
		System.out.println("¿Cuántas arañas has capturado?");
		numeroAranias = sc.nextInt();
		
		int totalAranias = numeroAranias * PATAARANIA;
		
		System.out.println("¿Cuántas cochinillas has capturado?");
		numeroCochinillas = sc.nextInt();
		
		int totalCochinillas = numeroCochinillas * PATACOCHINILLA;
		
		int totalPatas = totalHormigas + totalAranias + totalCochinillas;
		
		System.out.println("==============================================");
		System.out.println("Nº total de patas de las Hormigas: " + totalHormigas);
		System.out.println("Nº total de patas de las Arañas: " + totalAranias);
		System.out.println("Nº total de patas de las Cochinillas: " + totalCochinillas);
		System.out.println("Nº total de patas: " + totalPatas);
		System.out.println("==============================================");
		
		sc.close();
	}
}
