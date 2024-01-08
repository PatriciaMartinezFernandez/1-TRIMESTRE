package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int MAYOR_EDAD = 18;
		int edadUsuario;
		
		System.out.println("Porfavor, introduzca su edad:");
		edadUsuario = sc.nextInt();
		
		if (edadUsuario < MAYOR_EDAD) {
			System.out.println("Con " + edadUsuario + " eres menor de edad.");
		}
		else if (edadUsuario > MAYOR_EDAD) {
			System.out.println("Con " + edadUsuario + " eres mayor de edad.");
		}
		sc.close();
	}

}
