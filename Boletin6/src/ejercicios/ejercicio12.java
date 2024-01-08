package ejercicios;

import java.util.Scanner;

public class ejercicio12 {

	public static void compruebaRespuesta(String contrasena, String respuesta, int contador) {

		String pista;
		contador++;

		Scanner sc = new Scanner(System.in);

		if (contrasena != respuesta) {

			System.out.println("Fallaste!");

			System.out.println("¿Quieres usar las pistas? Si / No");
			pista = sc.nextLine();

			if (pista.equalsIgnoreCase("si")) {
				System.out.println("Número de carácteres: " + contrasena.length());
				System.out.println("Primera letra: " + contrasena.charAt(0));
				System.out.println("Última letra: " + contrasena.charAt(contrasena.length() - 1));
			}
			
			if (contrasena.compareTo(respuesta) < 0) {
				System.out.println("Menor alfabéticamente");
			}
			
			else {
				System.out.println("Mayor alfabéticamente");
			}

		}
	}

	public static void main(String[] args) {

		String contrasena, respuesta;
		int contadorIntentos = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Primer jugador introduce contraseña: ");
		contrasena = sc.nextLine();

		System.out.print("Segundo jugador introduce respuesta: ");
		respuesta = sc.nextLine();

		while (!(respuesta.equalsIgnoreCase(contrasena))) {

			compruebaRespuesta(contrasena, respuesta, contadorIntentos);

			System.out.print("Inténtalo otra vez: ");
			respuesta = sc.nextLine();

		}

		System.out.println("Acertaste!");

		sc.close();

	}

}
