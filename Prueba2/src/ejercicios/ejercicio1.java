package ejercicios;

import java.util.Scanner;

/*
 *  Haz un programa que lea un número entero de 4 cifras desde teclado y nos indique
	si el producto de las dos primeras cifras es mayor o menor del de las dos últimas.
	Preguntar al usuario si desea repetirlo hasta que conteste que no (“S” para sí y “N”
	para no)
	(2 puntos)
	IMPORTANTE:Realiza el ejercicio sin usar métodos de la clase Math.
	Ej: 3829, 3x8=24 2x9=21 ¿Cúal mayor? El producto de las dos primeras cifras es mayor.
 * */

public class ejercicio1 {

	public static void main(String[] args) {
		
		//variables para construir el numero
		int numero_uno, numero_dos, numero_tres, numero_cuatro;
		
		//varibles multiplicaciones
		int multiplicacion1 = 0, multiplicacion2 = 0;
		
		//respuesta y número ganador del juego
		int respuesta_juego, ganador = 0;
		
		//variable que contrala el acceso al bucle
		boolean entrada_bucle = true;
		
		//variable para salida del bucle s/n
		String Respuesta_bucle;
		
		
		Scanner sc = new Scanner(System.in);
		
		//comienzo del bucle
		while (entrada_bucle == true) {
			//construcción del numero
			System.out.println("Construye tu número entero de 4 cifras, escribe primer número:");
			numero_uno = sc.nextInt();
			
			System.out.println("Construye tu número entero de 4 cifras, escribe segundo número:");
			numero_dos = sc.nextInt();
			
			System.out.println("Construye tu número entero de 4 cifras, escribe tercer número:");
			numero_tres = sc.nextInt();
			
			System.out.println("Construye tu número entero de 4 cifras, escribe cuarto número:");
			numero_cuatro = sc.nextInt();
			
			//printea el numero resultante
			System.out.print("Este es tu número: " + numero_uno);
			System.out.print(numero_dos);
			System.out.print(numero_tres);
			System.out.println(numero_cuatro);
			
			//calculo multiplicaciones
			multiplicacion1 = numero_uno * numero_dos;
			multiplicacion2 = numero_tres * numero_cuatro;
			
			//comparaba ambos resultados y pregunta al usuario
			System.out.println("¿Cuál es mayor?");
			System.out.println("1) " + numero_uno + " * " + numero_dos + " = " + multiplicacion1);
			System.out.println("2) " + numero_tres + " * " + numero_cuatro + " = " + multiplicacion2);
			respuesta_juego = sc.nextInt();
			
			//define el numero ganador
			if (multiplicacion1 > multiplicacion2) {
				ganador = 1;
			}
			
			else {
				ganador = 2;
			}
			
			//compara numero ganador con respuesta
			if (respuesta_juego == 1 && ganador == 1 || respuesta_juego == 2 && ganador == 2) {
				System.out.println("Has ganado!");
			}
			
			else {
				System.out.println("Has perdido!");
			}
			
			// te pregunta si volvemos a jugar
			System.out.println("===================");
			System.out.println("¿Repetimos? s/n");
			Respuesta_bucle = sc.next();
			
			//en caso de n, salimos del bucle
			if (Respuesta_bucle.equals("n")) {
				entrada_bucle = false;
			}
		}
		
		sc.close();

	}

}
