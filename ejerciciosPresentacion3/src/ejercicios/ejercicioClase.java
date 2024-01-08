package ejercicios;

import java.util.Scanner;

public class ejercicioClase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int SUSPENSO = 5;
		final int SUFICIENTE = 6;
		final int BIEN = 7;
		final int NOTABLE = 9;
		final int SOBRESALIENTE = 10;
		int nota;
		
		System.out.println("Porfavor, introduzca su nota:");
		nota = sc.nextInt();
		
		if (nota < SUSPENSO) {
			System.out.println("Con un " + nota + " estas suspenso.");
		}
		else if (nota < SUFICIENTE) {
			System.out.println("Con un " + nota + " tienes un suficiente.");
		}
		else if (nota < BIEN) {
			System.out.println("Con un " + nota + " tienes un bien.");
		}
		else if (nota < NOTABLE) {
			System.out.println("Con un " + nota + " tienes un notable.");
		}
		else if (nota <= SOBRESALIENTE) {
			System.out.println("Con un " + nota + " tienes un sobresaliente.");
		}
		else if (nota > SUFICIENTE) {
			System.out.println("Es imposible sacar un " + nota);
		}

	sc.close();
	}
}
