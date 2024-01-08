package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		//Pedir tres números y mostrarlos ordenados de mayor a menor.
		
		Scanner sc = new Scanner(System.in);
		
		double numero1;
		double numero2;
		double numero3;
		
		System.out.println("Por favor, introduce el primer número:");
		numero1 = sc.nextDouble();
		
		System.out.println("Por favor, introduce el segundo número:");
		numero2 = sc.nextDouble();
		
		System.out.println("Por favor, introduce el tercero número:");
		numero3 = sc.nextDouble();
		
		sc.close();
		
		if (numero1 >= numero2 && (numero2 >= numero3))  {
			System.out.println("De mayor a menor: " + numero1 + ", " + numero2 + ", " + numero3);
		}
			else if (numero1 >= numero2 && (numero3 >= numero2)) {
			System.out.println("De mayor a menor: " + numero1 + ", " + numero3 + ", " + numero2);
			}

			else if  (numero2 >= numero1 && (numero1 >= numero3)) {
			System.out.println("De mayor a menor: " + numero2 + ", " + numero1 + ", " + numero3);
		}
			else if (numero2 >= numero1 && (numero3 >= numero1)) {
			System.out.println("De mayor a menor: " + numero2 + ", " + numero3 + ", " + numero1);
			}
		
			else if (numero3 >= numero1 && (numero1 >= numero2)) {
			System.out.println("De mayor a menor: " + numero3 + ", " + numero1 + ", " + numero2);
		}
			else if (numero3 >= numero1 && (numero2 >= numero1)) {
			System.out.println("De mayor a menor: " + numero3 + ", " + numero2 + ", " + numero1);
			}
	}
}

