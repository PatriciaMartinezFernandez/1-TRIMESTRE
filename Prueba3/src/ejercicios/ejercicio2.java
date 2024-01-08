package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	//calcula n1 y n2 dependiendo de tu respuesta
	public static void calculadora(int num1, int num2, int respuesta ) {
		
		if (respuesta == 1) {
			int suma = num1 + num2;
			System.out.println("Resultado: " + suma);
		}

		else if (respuesta == 2) {
			int resta = num1 - num2;
			System.out.println("Resultado: " + resta);
		} 
		
		else if (respuesta == 3) {
			int multiplicacion = num1 * num2;
			System.out.println("Resultado: " + multiplicacion);
			
		} 
		
		else if (respuesta == 4) {
			int division = num1 / num2;
			System.out.println("Resultado: " + division);
		}

		else {
			System.out.println("Ese número no vale");
		}
		
	}

	public static void main(String[] args) {

		int num1, num2, respuesta;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dime tu primer número:");
		num1 = sc.nextInt();

		System.out.println("Dime tu segundo número:");
		num2 = sc.nextInt();

		System.out.println("¿Qué quieres hacer?");
		System.out.println("1) Sumar");
		System.out.println("2) Restar");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");
		respuesta = sc.nextInt();

		calculadora(num1, num2, respuesta);

		sc.close();

	}

}
