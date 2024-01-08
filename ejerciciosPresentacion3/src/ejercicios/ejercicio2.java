package ejercicios;

import java.util.Scanner;

	public class ejercicio2 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			float num1;
			float num2;

			System.out.println("¿Qué número es mayor?");
			System.out.println("================================");
			System.out.println("Introduce el primer número:");
			num1 = sc.nextFloat();
			System.out.println("Introduce el segundo número:");
			num2 = sc.nextFloat();
			
			if (num1 > num2) {
				System.out.println(num1 + " es mayor que " + num2);
			}
			else if (num1 < num2) {
				System.out.println(num1 + " es menor que " + num2);
			}
			else if (num1 == num2) {
				System.out.println(num1 + " es igual que " + num2);
			}
			sc.close();
		}
}