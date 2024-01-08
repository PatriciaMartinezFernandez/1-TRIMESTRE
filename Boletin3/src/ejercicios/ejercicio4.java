package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		//Escribe un programa que calcule el salario semanal de un trabajador teniendo en
		//cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros
		//la hora. A partir de la hora 41, se pagan a 16 euros la hora.

		Scanner sc = new Scanner(System.in);
		
		int horasTrabajadas;
		final int HORAS_ORDINARIAS = 40;
		int pago= 0;

		System.out.println("Especifique cuántas horas trabaja semanalmente");
		horasTrabajadas = sc.nextInt();
		
		if (horasTrabajadas <= HORAS_ORDINARIAS) {
			pago = 12;
		}
		else {
			pago = 16;
		}
		
		int salarioSemanal = horasTrabajadas * pago;
		
		System.out.println("Este es tu salario semanal: " + salarioSemanal + "€");
		
		sc.close();
	}

}
