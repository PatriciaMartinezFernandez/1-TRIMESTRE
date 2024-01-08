package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {

		double[] notasAlumnos = new double[10];
		double nota, totalNotas = 0, mediaNotas;
		
		int contadorSuspenso = 0, contadorAprobados = 0, contadorNotables = 0, contadorSobresalientes = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== Notas de 10 alumnos ==\n");
		
		for (int i = 0; i < notasAlumnos.length; i++) {
			
			System.out.println("Escribe la nota: ");
			nota = sc.nextDouble();
			
			totalNotas += nota;
			
			if (nota >= 9) {
				contadorSobresalientes++;
			}
			
			else if (nota >= 7 && nota <= 8.99) {
				contadorNotables++;
			}
			
			else if (nota >= 5 && nota <= 6.99) {
				contadorAprobados++;
			}
			
			else {
				contadorSuspenso++;
			}
			
		}
		
		mediaNotas = totalNotas / notasAlumnos.length;
		
		System.out.println("\nSobresalientes: " + contadorSobresalientes);
		System.out.println("Aprobados: " + contadorAprobados);
		System.out.println("Notables: " + contadorNotables);
		System.out.println("Suspensos: " + contadorSuspenso);
		
		System.out.println("\nMedia: " + mediaNotas);
		
		sc.close();
		
	}

}
