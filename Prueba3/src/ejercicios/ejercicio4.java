package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	//busca los numeros comprendidos de n1 a n2
	public static void comprendidos(int num1,int num2 ) {
		
		for (int i = num1; num2 >= i; i++) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {

		int num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame el primer número:");
		num1 = sc.nextInt();
		System.out.println("Dame el segundo número:");
		num2 = sc.nextInt();

		comprendidos(num1, num2);
		sc.close();

	}

}
