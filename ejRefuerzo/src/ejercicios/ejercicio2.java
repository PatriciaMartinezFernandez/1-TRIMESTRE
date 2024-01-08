package ejercicios;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
	final int EUROHORA = 12;
	int horasDia;
	final int DIASEMANA = 7;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("¿Cuántas horas trabajas al día?");
	horasDia = sc.nextInt();
	
	int todasHoras = horasDia * DIASEMANA;
	int salarioSemanal = todasHoras * EUROHORA;
	
	System.out.println("Esto es lo que ganas semanalmente: " + salarioSemanal);
	
	sc.close();
	
	}
}
