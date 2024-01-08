package ejercicios;

import java.util.Scanner;

public class ejercicio9 {

	public static void quitaVocales(String nombreApellido) {

		nombreApellido = nombreApellido.toLowerCase();
		String resultado = "";

		for (int i = 0; i < nombreApellido.length(); i++) {

			if (!(nombreApellido.charAt(i) == 'a' || nombreApellido.charAt(i) == 'e' || nombreApellido.charAt(i) == 'i'
					|| nombreApellido.charAt(i) == 'o' || nombreApellido.charAt(i) == 'u'
					|| nombreApellido.charAt(i) == 'á' || nombreApellido.charAt(i) == 'é'
					|| nombreApellido.charAt(i) == 'í' || nombreApellido.charAt(i) == 'ó'
					|| nombreApellido.charAt(i) == 'ú')) {

				resultado += nombreApellido.charAt(i);
			}

		}

		System.out.println(resultado);
	}

	public static void main(String[] args) {

		String nombreApellido;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu nombre y tus apellidos: ");
		nombreApellido = sc.nextLine();

		quitaVocales(nombreApellido);

		sc.close();

	}

}
