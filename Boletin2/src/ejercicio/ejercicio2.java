package ejercicio;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		float numero1;
		float numero2;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.println("Inserta tu primer número:");
			//Pide primer número entero
			numero1 = sc.nextFloat();
			System.out.println("Inserta tu segundo número:");
			//Pide segundo número entero
			numero2 = sc.nextFloat();
			
			//Elige operador
			System.out.println("Elige entre: Suma(+), Resta(-), Multiplación(*) y División(/)");
			String operacion = sc.next();
			
			float resultadoSuma = numero1 + numero2;
			float resultadoResta = numero1 - numero2;
			float resultadoMultiplicacion = numero1 * numero2;
			float resultadoDivision = numero1 / numero2;
		
				if (operacion.equals("+")) {
					System.out.println("El resultado de " + numero1 + " + " + numero2 + " es: " + resultadoSuma);
				}	
				else if (operacion.equals("-")) {
					System.out.println("El resultado de " + numero1 + " - " + numero2 + " es: " + resultadoResta);
				}
				else if (operacion.equals("*")) {
					System.out.println("El resultado de " + numero1 + " * " + numero2 + " es: " + resultadoMultiplicacion);
				}
				else if (operacion.equals("/")) {
					System.out.println("El resultado de " + numero1 + " / " + numero2 + " es: " + resultadoDivision);
				}
		
			System.out.println("Otra vez? (s/n)");
			String otravez = sc.next();
				
			if (!otravez.equals("s")){
				break;
			}
		}
	}	
}
