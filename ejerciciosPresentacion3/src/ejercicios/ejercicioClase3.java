package ejercicios;

import java.util.Scanner;

public class ejercicioClase3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double peso;
		double altura; 
		final double BAJO_DE_PESO = 18.5;
		final double NORMAL = 25;
		final double SOBREPESO = 30;
		
		System.out.println("Introduce tu peso:");
		peso = sc.nextDouble();
		
		System.out.println("Introduce tu altura en m:");
		altura = sc.nextDouble();
		
		double IMC = peso / (altura * altura)  ;
		System.out.println(IMC);
		
		if (IMC <= BAJO_DE_PESO) {
			System.out.println("Tu IMC es bajo");
			}
			
			else if (IMC <= NORMAL) {
				System.out.println("Tu IMC es normal");
			}
		
			else if (IMC <= SOBREPESO) {
				System.out.println("Tu IMC es sobrepeso");
			}	
		
			else  {
				System.out.println("Tu IMC es obeso");
			}	
		sc.close();
		}		
	}

		