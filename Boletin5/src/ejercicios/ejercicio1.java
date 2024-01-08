package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	

	public static void main(String[] args) {

		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número de veces que se imprime el mensaje: ");
		n = sc.nextInt();
		 
		eco(n); 
		
		sc.close();
		
	}

	public static void eco(int n) {
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Eco: " + i);
		}
	}
}
