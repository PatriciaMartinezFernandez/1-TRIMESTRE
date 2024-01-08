package ejercicios;

import java.util.Scanner;

/**3. Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se
especifique. Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para
el volumen). Además, hemos de pasarle a la función el radio de la base y la altura.
área = 2π · radio · (altura + radio)
volumen = π · radio2 · altura
**/

public class ejercicio3 {

	public static double area(double radio,double altura) {
		
		double area = (Math.PI * 2) * radio * (altura + radio);
		return (Math.round(area * 100d) / 100d);
		
	}
	
	public static double volumen(double radio,double altura) {
		
		double volumen = Math.PI * (radio * radio) * altura;
		return (Math.round(volumen * 100d) / 100d);
		
	}
	
	public static void main(String[] args) {

		double altura, radio;
		int respuesta;
		boolean entrada_bucle = true;
		
		Scanner sc = new Scanner(System.in);
		
		while (entrada_bucle == true) {
		
			System.out.println("¿Vamos a calcular el área(1) o el volumen(2)?");
			respuesta = sc.nextInt();
			
			if (respuesta == 1) {
				
				entrada_bucle = false;
				
				System.out.print("Dime el radio: ");
				radio = sc.nextDouble();
				
				System.out.print("Dime la altura: ");
				altura = sc.nextDouble();
				
				System.out.println("Resultado área: " + area(radio,altura) + " m2");
			}
			
			else if (respuesta == 2) {
				
				entrada_bucle = false;
				
				System.out.print("Dime el radio: ");
				radio = sc.nextDouble();
				
				System.out.print("Dime la altura: ");
				altura = sc.nextDouble();
				
				System.out.println("Resultado volumen: " + volumen(radio,altura) + " m3");
				
			}
			
			else {
				System.out.println("Te has equivocado, elige otra vez.");
			}	
		}
		
		sc.close();

	}
}
