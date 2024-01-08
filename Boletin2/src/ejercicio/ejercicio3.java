package ejercicio;

import java.util.Scanner;

public class ejercicio3 {
	
	public static void main(String[] args) {
		
		String nombre;
		int edad;
		
		Scanner sc = new Scanner(System.in);
	
		//Entrada de nombre
		System.out.println("Introduce tu nombre");	
		nombre = sc.next();
		
		//Entrada de edad
		System.out.println("Introduce tu edad");	
		edad = sc.nextInt();
		
		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Tu edad es: " + edad);
		System.out.println("Y el próximo año tendrás: " + (edad + 1));
		
		sc.close();
	}
}