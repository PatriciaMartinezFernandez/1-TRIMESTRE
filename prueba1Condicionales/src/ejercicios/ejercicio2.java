package ejercicios;

import java.util.Scanner;

//Diseñe un programa que lea la temperatura en centígrados del día e imprima el tipo de
//clima de acuerdo a la siguiente tabla

public class ejercicio2 {

	public static void main(String[] args) {
		
		//Variables y condicionales
		int temperatura;
		final int FRIO = 10;
		final int NUBLADO = 20;
		final int CALUROSO = 30;
		final int TEMPERATURAEXTREMA_FRIO = -10;
		final int TEMPERATURAEXTREMA_CALOR = 50;
		
		Scanner sc = new Scanner(System.in);
		
		//Pide temperatura al usuario
		System.out.println("Introduce la temperatura: ");
		temperatura = sc.nextInt();
		
		//Resuelve la temperatura acorde a la tabla de requisitos (en el pdf)
		if (temperatura <= FRIO && temperatura > TEMPERATURAEXTREMA_FRIO) { // x <= 10 y x > -10
			System.out.println("La temperatura es: frío");
		}
		
		else if (temperatura <= NUBLADO && temperatura > FRIO) { // x <= 20 y x > 10
			System.out.println("La temperatura es: nublado");
		}
		
		else if (temperatura <= CALUROSO && temperatura > NUBLADO) { // x <= 30 y x > 20
			System.out.println("La temperatura es: caluroso");
		}
		
		if (temperatura > CALUROSO && temperatura < TEMPERATURAEXTREMA_CALOR) { // x > 30 y x < 50
			System.out.println("La temperatura es: tropical");
		}
		
		else if (temperatura <= TEMPERATURAEXTREMA_FRIO || temperatura >= TEMPERATURAEXTREMA_CALOR) { // x <= -10 o x >= 50
			System.out.println("La temperatura es: extrema");
		}
		sc.close();

	}

}
