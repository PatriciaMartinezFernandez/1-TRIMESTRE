package ejercicios;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		//Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Recordamos
		//que existen meses con 28, 30 y 31 días. No consideraremos los años bisiestos.
		
		int dia;
		int mes;
		int anio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el día, mes y año. (Ej: 10 1 2023)");
		dia = sc.nextInt();
		mes = sc.nextInt();
		anio = sc.nextInt();
		
		sc.close();
		
		if (mes == 1 && (dia <= 31)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta");
		}
			
		else if (mes == 2 && (dia <= 28)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta"); 				
		}
					
		else if (mes == 3 && (dia <= 31)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta"); 
		}
		
		else if (mes == 4 && (dia <= 30)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta"); 			
		}
		
		else if (mes == 5 && (dia <= 31)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta"); 			
		}
		
		else if (mes == 6 && (dia <= 30)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta"); 			
		}
		
		else if (mes == 7 && (dia <= 31)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta"); 			
		}
		
		else if (mes == 8 && (dia <= 31)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta"); 			
		}
		
		else if (mes == 9 && (dia <= 30)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta"); 			
		}
		
		else if (mes == 10 && (dia <= 31)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta"); 			
		}
		
		else if (mes == 11 && (dia <= 30)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta"); 			
		}
		
		else if (mes == 12 && (dia <= 31)) {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" es correcta"); 			
		}
		
		else {
			System.out.println("La fecha " + dia + " , " + mes + " , " + anio +" no es correcta");
		}
	}
}	


