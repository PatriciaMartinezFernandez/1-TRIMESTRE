package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static boolean detectaJavalense(String mensaje, String muletilla, String coletilla) {

		boolean javalandia = false;

		while (mensaje.indexOf(muletilla) > -1) {

			mensaje = mensaje.substring(mensaje.indexOf(muletilla) + muletilla.length(), mensaje.length());
			javalandia = true;

		}

		while (mensaje.indexOf(coletilla) > -1) {

			mensaje = mensaje.substring(mensaje.indexOf(coletilla) + coletilla.length(), mensaje.length());
			javalandia = true;

		}

		return javalandia;

	}

	public static void traductorJavalense(String mensaje, String muletilla, String coletilla) {

		while (mensaje.indexOf(muletilla) > -1) {

			mensaje = mensaje.substring(mensaje.indexOf(muletilla) + muletilla.length(), mensaje.length());

		}

		while (mensaje.indexOf(coletilla) > -1) {

			mensaje = mensaje.substring(0, mensaje.length() - coletilla.length());

		}

		System.out.println("Traducción: " + mensaje.trim());

	}

	public static void main(String[] args) {

		String muletilla = "Javalin, javalon...";
		String coletilla = " javalen, len, len";
		String mensaje;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el mensaje: ");
		mensaje = sc.nextLine();

		System.out.println("Javalense detectado?: " + detectaJavalense(mensaje, muletilla, coletilla));

		if (detectaJavalense(mensaje, muletilla, coletilla) == true) {

			traductorJavalense(mensaje, muletilla, coletilla);
		}

		sc.close();

	}

}
