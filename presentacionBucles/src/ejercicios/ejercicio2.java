package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		int contador = 0;
		double notamin;
		double sumaNotas = 0;
		double nota;
		double promedio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cúal es la nota (-1 para salir): ");
		nota = sc.nextDouble();
		
		notamin = nota;
		
		while (nota != -1)   {
			
			System.out.println("Cúal es la nota (-1 para salir): ");
			nota = sc.nextDouble();
	
				if (nota < notamin) {
					notamin = nota;
				}
				contador++;
				sumaNotas = sumaNotas + nota;
			
		}
		
		System.out.println("La nota mínima es: " + notamin);
		contador--;
		promedio = (sumaNotas - notamin) / contador;
		System.out.println("La nota promedio es: " + promedio);
		
		sc.close();

	}

}
