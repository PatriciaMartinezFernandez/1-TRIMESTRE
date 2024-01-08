package ejercicios;

import java.util.Scanner;

/**9. Diseñar una función que calcule a^n , donde a es real y n entero no negativo. Realizar una
versión iterativa y otra recursiva.**/

public class ejercicio9 {
	
	public static void iterativo(int base, int exponente) {
		
		int resultado = 1;
		
		for (int i = exponente; i > 0;i--) {
            
			 resultado = resultado * base;
			 
        }
		
		System.out.println(resultado);
		
	}

	public static int recursivo(int base, int exponente) {
		 
		int resultado = 1;
		
		if (exponente == 0) {
			return 1;
			
		}
		
		else {
			resultado = base * recursivo(base, exponente - 1);
			return resultado;
		}
		
	}
	
	public static void main(String[] args) {

		int base, exponente;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce a: ");
		base = sc.nextInt();
		
		System.out.println("Introduce n (tiene que ser positivo): ");
		exponente = sc.nextInt();
		
		if (exponente < 0) {
			System.out.println("Valor incorrecto para n");
		}
		
		System.out.print("Resultado iterativo: ");
		iterativo(base, exponente);
		
		System.out.print("Resultado recursivo: " + recursivo(base, exponente));
		
		sc.close();
		

	}

}
