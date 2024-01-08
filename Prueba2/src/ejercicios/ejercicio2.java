package ejercicios;

import java.util.Scanner;

/*
 * De un operario se conoce su sueldo y los años de antigüedad. Se pide realizar un
	programa que lea los datos de entrada (sueldo y antigüedad) e informe de su sueldo
	actualizado según las siguientes condiciones:
	● Si el sueldo es inferior a 1000 y su antigüedad es igual o superior a 10 años,
	otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
	● Si el sueldo es inferior a 1000 pero su antigüedad es menor a 10 años, otorgarle
	un aumento de 5 %, mostrar el sueldo a pagar..
	● Si el sueldo es mayor o igual a 1000, mostrar el sueldo a pagar.

 * */

public class ejercicio2 {

	public static void main(String[] args) {
		
		//variables y constante mil
		double sueldo, antiguedad, aumento = 0, resultado = 0;
		final int MIL = 1000;
		
		//aumentos de sueldo
		final double AUMENTO_20 = 0.2;
		final double AUMENTO_5 = 0.05;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu sueldo:");
		sueldo = sc.nextInt();
		
		System.out.println("Introduce tus años de antigüedad:");
		antiguedad = sc.nextInt();
		
		//comprueba sueldo y antigüedad y aplica el aumento correspondiente
		if (sueldo < MIL && antiguedad >= 10) {
			aumento =  sueldo * AUMENTO_20;
			resultado = sueldo + aumento;
			System.out.println("Sueldo a pagar: " + resultado + "€");
		}
		
		if (sueldo < MIL && antiguedad < 10) {
			aumento =  sueldo * AUMENTO_5;
			resultado = sueldo + aumento;
			System.out.println("Sueldo a pagar: " + resultado + "€");
		}

		if (sueldo >= MIL ) {
			System.out.println("Sueldo a pagar: " + sueldo + "€");
		}
		
		sc.close();

	}

}
