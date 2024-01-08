package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		float nota1;
		float notaTrimestre;
		float notaNecesaria;
		final int CIENPORCIENTO = 100;
		final int CUARENTAPORCIENTO = 40;
		final int SESENTAPORCIENTO = 60;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota del primer examen:");
		nota1 = sc.nextFloat();
		
		System.out.println("¿Qué nota quieres sacer en el trimestre?");
		notaTrimestre = sc.nextFloat();
		
		notaNecesaria = ((notaTrimestre * CIENPORCIENTO) - (nota1 * CUARENTAPORCIENTO)) / SESENTAPORCIENTO;
		
		System.out.println("Para tener un " + notaTrimestre + " en el trimestre necesitas sacar un " + notaNecesaria + " en el segundo examen");
		
		if (notaNecesaria > 10) {
			System.out.println("Por lo tanto, no puedes sacar un " + notaTrimestre + " en este trimestre");
		}
		sc.close();

	}

}
