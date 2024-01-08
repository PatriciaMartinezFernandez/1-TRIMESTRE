package ejercicios;

import java.util.Scanner;

/**8. Escribir una función que decida si dos números enteros positivos son amigos. Dos
números son amigos si la suma de sus divisores propios (distintos de ellos mismos) son
iguales.**/

public class ejercicio8 {
	
	public static boolean amigos(int num1,int num2) {
		
		boolean amigos = false;
		int sumatorio1 = 0, sumatorio2 = 0;
		
		for (int i = 1; i < num1; i ++) {
			
			if (num1 % i == 0) {
				sumatorio1 += i;	
			}
		}
		
		for (int i = 1; i < num2; i ++) {
			
			if (num2 % i == 0) {
				sumatorio2 += i;	
			}
		}
		
		if (sumatorio1 == sumatorio2) {
			amigos = true;
		}
		
		return amigos;
		
	}

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextInt();
		
		if (num1 < 0 || num2 < 0) {
			System.out.println("Ese número no vale porque es negativo");
		}
		
		System.out.println("¿Son amigos?: " + amigos(num1,num2));
		
		sc.close();

	}

}
