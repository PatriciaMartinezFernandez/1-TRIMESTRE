package ejercicios;

import java.util.Scanner;

/**4. Diseñar dos función que reciban como parámetros tres números enteros y que devuelva
una el máximo y otra el mínimo de los tres números.
**/

public class ejercicio4 {
	
	public static int maximo(int num1,int num2,int num3) {
		 
		int maximo;
		
		if (num1 > num2  && num1 > num3) {
			maximo = num1;
		}
		
		else if (num2 > num1 && num2 > num3) {
			maximo = num2;
		}
		
		else {
			maximo = num3;
		}
		
		return maximo;
	}
	
	public static int minimo(int num1,int num2,int num3) {
		
		int minimo;
		
		if (num1 < num2  && num1 < num3) {
			minimo = num1;
		}
		
		else if (num2 < num1 && num2 < num3) {
			minimo = num2;
		}
		
		else {
			minimo = num3;
		}
		
		return minimo;
	}

	public static void main(String[] args) {

		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe el primer número: ");
		 num1 = sc.nextInt();
		 
		System.out.print("Escribe el segundo número: ");
		 num2 = sc.nextInt();
		 
		System.out.print("Escribe el tercer número: ");
		 num3 = sc.nextInt();
		 
		 System.out.println("======================================");
		 System.out.println("El número máximo es: " + maximo(num1, num2, num3));
		 System.out.println("El número minimo es: " + minimo(num1, num2, num3));
		 
		sc.close();
		

	}

}
