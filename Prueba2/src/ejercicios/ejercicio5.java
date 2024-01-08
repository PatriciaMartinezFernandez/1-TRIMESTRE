package ejercicios;

import java.util.Scanner;

/*
 * Realizar un algoritmo que lea notas comprendidas entre 0 y 10 y que termine la
	lectura de dichas notas cuando se introduzca una nota no válida. El programa debe
	mostrar la nota válida más alta, la nota válida más baja y la nota media en texto:
	● 0<= media <5 : Suspenso
	● 5<= media <7 : Aprobado
	● 7<= media <=10 : Excelente

 * */

public class ejercicio5 {

	public static void main(String[] args) {
		
		//variables
		int nota = 1, contador_notas = 0, mas_alta = 0, mas_baja = 10,sumatorio_notas = 0, media_numerica = 0;
		String Media = "";
		
		//constantes media
		final String SUSPENSO = "Suspenso";
		final String APROBADO = "Aprobado";
		final String EXCELENTE = "Excelente";

		Scanner sc = new Scanner(System.in);
		
		// mientras no este fuera de rango (1-10) funciona
		while (nota >= 1 && nota <= 10) {
			
			System.out.println("Introduce tu nota (1-10):");
			nota = sc.nextInt();
			
			contador_notas++;
			
			//guarda mas alta
			if (nota  > mas_alta) {
				mas_alta = nota;
			}
			
			//guarda mas baja
			if (nota  < mas_baja) {
				mas_baja = nota;
			}
			
			//te saca cuando llevas 10 notas
			if (contador_notas == 10) {
				nota = -1;
			}
			
			//calculo media
			sumatorio_notas += nota;
			media_numerica =  sumatorio_notas / contador_notas ;
			
			//resultado de la media en texto
			switch (media_numerica) {
			case 8,9,10: Media = EXCELENTE; break;
			case 5,6,7: Media = APROBADO; break;
			case 0,1,2,3,4: Media = SUSPENSO; break;
			}
			
			
			
		}
		
		//resultado
		System.out.println("Tu nota más alta: " + mas_alta);
		System.out.println("Tu nota más baja: " + mas_baja);
		System.out.println("Tu nota media: " + media_numerica + " = " + Media);
		
		sc.close();

	}

}
