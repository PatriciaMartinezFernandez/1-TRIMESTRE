package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicioClase2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int num1 = (rnd.nextInt(10)); //Genera un número de 0 a 9
		int num2 = (rnd.nextInt(10)); // Genera un número de 0 a 9 		
		int respuestaUsuario;
		int resultado = num1 - num2;
		
		if (num1 >= num2) {
			System.out.println("Vamos a aprender a restar:");
			System.out.println("¿Cuánto es " + num1 + " - " + num2 + "?");
			respuestaUsuario = sc.nextInt();
			
			if (respuestaUsuario == resultado) {
				System.out.println("Correcto!");
			}
			
			else if (respuestaUsuario != resultado) {
				System.out.println("Incorrecto!");
				System.out.println("El resultado es: " + resultado);
			}			
		}
		
		else if (num1 < num2) {
			System.out.println("Error");
		}
		
		sc.close();
		
	}
}
		

