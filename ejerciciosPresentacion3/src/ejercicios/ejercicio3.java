package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		//El rango de random es hasta el 100
		int num1 = (rnd.nextInt(100));
		int num2 = (rnd.nextInt(100));
		int respuestaUsuario;
		int resultado = num1 + num2;
		
		System.out.println("¿Cuánto es " + num1 + " + " + num2 + "?");
		respuestaUsuario = sc.nextInt();
		
		if (respuestaUsuario == resultado) {
			System.out.println("Correcto!");
		}
		
		else if (respuestaUsuario != resultado) {
			System.out.println("Incorrecto!");
			System.out.println("El resultado es: " + resultado);
		}
				
		sc.close();
	}
}
