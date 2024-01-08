package ejercicios;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		//Solicitar el día y el mes al usuario e indicar la estación (invierno, primavera, verano y
		//otoño) en la que nos encontramos (en el hemisferio norte), es decir:
			
		int dia;
		int mes;
		int primaveraEmpieza = 21;
		int primaveraAcaba = 20;
		int veranoEmpieza = 21;
		int veranoAcaba = 20;
		int otonioEmpieza = 21;
		int otonioAcaba = 20;
		int inviernoEmpieza = 21;
		int inviernoAcaba = 20;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica el día:");
		dia = sc.nextInt();
		
		System.out.println("Indica el mes:");
		mes = sc.nextInt();
		
		sc.close();
		
		//primavera: del 21/03 al 20/06
		if ((dia >= primaveraEmpieza && mes >= 3) || (dia <= primaveraAcaba && mes <= 6)) {
			System.out.println("Primavera: " + dia + "/" + mes);
		}
		
		//verano: del 21/06 al 20/09
		else if ((dia >= veranoEmpieza && mes >= 6) ||  (dia <= veranoAcaba && mes <= 9)) {
			System.out.println("Verano: " + dia + "/" + mes);
		}
		
		//otoño: del 21/09 al 20/12
		else if ((dia >= otonioEmpieza && mes >= 9) ||  (dia <= otonioAcaba && mes <= 12)) {
			System.out.println("Otoño: " + dia + "/" + mes);
		}
		
		//invierno: del 21/12 al 20/03
		else if ((dia >= inviernoEmpieza && mes >= 12) ||  (dia <= inviernoAcaba && mes <= 3)) {
			System.out.println("Invierno: " + dia + "/" + mes);
		}
	}
}
