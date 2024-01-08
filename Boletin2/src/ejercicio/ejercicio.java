package ejercicio;

import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		int radio;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Elige el tamaño de tu radio");
		
		//Pide por teclado el valor de radio
		radio = sc.nextInt();
		
		final double PI = 3.14159;
		double area = radio * radio * PI;
		double longitud = radio * 2;
		
		//Muestra los resultados
		System.out.println("El área del círculo de radio " + radio + " es " + area);
		System.out.println("La longitud del círculo de radio " + radio + " es " + longitud);
		
		sc.close();
	}

}
