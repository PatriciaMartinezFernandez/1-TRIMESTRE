package ejercicio;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		
		int nota1;
		int nota2;
		final int RECUENTO = 2;
		
		Scanner sc = new Scanner(System.in);
		
		//Entrada primera nota
		System.out.println("Escribe el número de tu primera nota:");
		nota1 = sc.nextInt();
		
		//Entrada segunda nota
		System.out.println("Escribe el número de tu segunda nota:");
		nota2 = sc.nextInt();
		
		int sumaRecuento = nota1 + nota2;
		float mediaAritmetica =  sumaRecuento / RECUENTO;
		
		System.out.println("Tu media aritmética es de: " + mediaAritmetica);
		
		sc.close();
	}

}
