package ejercicios;

import java.util.Scanner;

// ¿Qué modificación tendrías que realizar en el ejercicio anterior, para que el usuario
//pudiera ejecutar el programa correspondiente tantas veces como quisiera? Por ejemplo se
//puede realizar la pregunta: ¿Deseas seguir ejecutando el programa S/N? y dependiendo de
//la respuesta se siga ejecutando o no

public class ejercicio9 {

	public static void main(String[] args) {
		
		int base, exponente;
		String Respuesta;
		boolean entrada_bucle = true;
		
		while (entrada_bucle != false) {

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Escribe la base: ");
			base = sc.nextInt();
			
			System.out.println("Escribe el exponente: ");
			exponente = sc.nextInt();
			
			for (int i = 1; i < exponente;i++) {
				System.out.print(base + " * ");
				}
				
			System.out.println(base);
			
			System.out.println("¿Deseas seguir ejecutando el programa s/n?");
			Respuesta = sc.next();
			
			if (Respuesta.equals("n")) {
				entrada_bucle = false;
				System.out.println("Byeee");
				
				sc.close();
			}
			
		}

	}

}
