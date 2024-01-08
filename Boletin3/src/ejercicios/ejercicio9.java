package ejercicios;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		//Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
		//correspondiente a un día de la semana. Se debe mostrar el nombre del día de la
		//semana al que corresponde. Por ejemplo, el número 1 corresponde a «lunes» y el 6
		//a «sábado».
		
		int dia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el día de la semana (Ej: Lunes = 1)");
		dia = sc.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Hoy es Lunes");
			break;
		case 2:
			System.out.println("Hoy es Martes");
			break;
		case 3:
			System.out.println("Hoy es Miércoles");
			break;
		case 4:
			System.out.println("Hoy es Jueves");
			break;
		case 5:
			System.out.println("Hoy es Viernes");
			break;
		case 6:
			System.out.println("Hoy es Sábado");
			break;
		case 7:
			System.out.println("Hoy es Domingo");
			break;
		}
		
		sc.close();
	}

}
