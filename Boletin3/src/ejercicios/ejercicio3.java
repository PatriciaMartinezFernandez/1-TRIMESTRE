package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		//Implementar un programa que pida por teclado un número decimal e indique si es un
		//número casi-cero, que son aquellos, positivos o negativos, que se acercan a 0 por
		//menos de 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero.
		//Ejemplos
		//Números casi-cero son el 0.3, el –0.99 o el 0.123. Y números que no se
		//consideran casi-ceros son: el 12.3, el 0 o el –1.
		
		Scanner sc = new Scanner(System.in);
		
		double numeroDecimal;
		
		System.out.print("Introduce un número decimal");
		numeroDecimal = sc.nextDouble();
		sc.close();
		
		if (numeroDecimal < 0.5 && (numeroDecimal > -0.5)) {
			System.out.println("El número es casi cero");
		}
		
		else
			System.out.println("El número no es casi cero");
		}
}
