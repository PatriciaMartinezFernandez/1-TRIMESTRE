package ejercicio;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float nota1;
		float nota2;
		float nota3;
		final int RECUENTO = 3;
		
		//Entrada primera nota
		System.out.println("Escribe el número de tu primera nota:");
		nota1 = sc.nextFloat();
		
		//Entrada segunda nota
		System.out.println("Escribe el número de tu segunda nota:");
		nota2 = sc.nextFloat();
		
		//Entrada tercera nota
		System.out.println("Escribe el número de tu tercera nota:");
		nota3 = sc.nextFloat();
		
		float sumaRecuento = nota1 + nota2 + nota3;
		float mediaAritmetica =  sumaRecuento / RECUENTO;
		
		System.out.println("Tu media aritmética es de: " + Math.round(mediaAritmetica));
		
		sc.close();
	}
}


