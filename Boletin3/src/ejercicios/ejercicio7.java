package ejercicios;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		//. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente (de 0 a 4), Suficiente
		//(5), Bien (6), Notable (7 y 8) y Sobresaliente (9 y 10).
		
		int nota;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nota del 0-10:");
		nota = sc.nextInt();
		
		switch (nota) {
			case 1:
			case 2:
			case 3:
			case 4: 
				System.out.println("Un " + nota + " es insuficiente");
				break;
			case 5:
				System.out.println("Un " + nota + " es suficiente");
				break;
			case 6:
				System.out.println("Un " + nota + " es bien");
				break;
			case 7:
			case 8:
				System.out.println("Un " + nota + " es notable");
				break;
			case 9:
			case 10:
				System.out.println("Un " + nota + " es sobresaliente");
				break;
		}
		
		sc.close();

	}

}
