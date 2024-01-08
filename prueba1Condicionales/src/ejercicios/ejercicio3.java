package ejercicios;

import java.util.Scanner;

//El promedio de prácticas de un curso se calcula en base a cuatro prácticas calificadas de
//las cuales se elimina la nota menor y se promedian las tres notas más altas. Diseñe un
//algoritmo que determine la nota eliminada y el promedio de prácticas de un estudiante.


public class ejercicio3 {
	
	public static void main(String[] args) {
		
		//Variables
		float nota1, nota2, nota3, nota4; //primeras notas
		float notaPrimera = 0, notaSegunda = 0, notaTercera = 0; // notas ordenadas
		float notaMenor = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//Pide las notas
		System.out.println("Primera nota: ");
		nota1 = sc.nextFloat();
		
		System.out.println("Segunda nota: ");
		nota2 = sc.nextFloat();
		
		System.out.println("Tercera nota: ");
		nota3 = sc.nextFloat();
		
		System.out.println("Cuarta nota: ");
		nota4 = sc.nextFloat();
		
		sc.close();
		
		//Resuelve cuál es la nota más baja y ordenada las restantes
		if (nota1 >= nota2 && nota2 >= nota3 && nota2 >= nota4) {
			notaMenor = nota4;
			notaPrimera = nota1;
			notaSegunda = nota2;
			notaTercera= nota3;
		}
		
		else if (nota1 >= nota2 && nota2 >= nota3 && nota4 >= nota3) {
			notaMenor = nota3;
			notaPrimera = nota1;
			notaSegunda = nota2;
			notaTercera= nota4;
		}
		
		else if (nota1 >= nota2 && nota3 >= nota2 && nota4 >= nota2) {
			notaMenor = nota2;
			notaPrimera = nota1;
			notaSegunda = nota3;
			notaTercera= nota4;
		}
		
		else if (nota2 >= nota1 && nota1 >= nota3 && nota1 >= nota4) {
			notaMenor = nota4;
			notaPrimera = nota1;
			notaSegunda = nota2;
			notaTercera= nota3;
		}
		
		else if (nota2 >= nota1 && nota1 >= nota3 && nota4 >= nota3) {
			notaMenor = nota3;
			notaPrimera = nota1;
			notaSegunda = nota2;
			notaTercera= nota4;
		}
		
		else if (nota2 >= nota3 && nota3 >= nota1 && nota4 >= nota1) {
			notaMenor = nota1;
			notaPrimera = nota2;
			notaSegunda = nota3;
			notaTercera= nota4;
		}
		
		else if (nota3 >= nota1 && nota1 >= nota2 && nota4 >= nota2) {
			notaMenor = nota2;
			notaPrimera = nota1;
			notaSegunda = nota3;
			notaTercera= nota4;
		}
		
		else if (nota3 >= nota2 && nota2 >= nota1 && nota4 >= nota1) {
			notaMenor = nota1;
			notaPrimera = nota2;
			notaSegunda = nota3;
			notaTercera= nota4;
		}
		
		else if (nota3 >= nota2 && nota2 >= nota1 && nota1 >= nota4) {
			notaMenor = nota4;
			notaPrimera = nota1;
			notaSegunda = nota2;
			notaTercera= nota3;
		}
		
		else if (nota4 >= nota2 && nota2 >= nota3 && nota3 >= nota1) {
			notaMenor = nota1;
			notaPrimera = nota2;
			notaSegunda = nota3;
			notaTercera= nota4;
		}
		
		else if (nota4 >= nota2 && nota2 >= nota3 && nota1 >= nota3) {
			notaMenor = nota3;
			notaPrimera = nota1;
			notaSegunda = nota2;
			notaTercera= nota4;
		}
		
		else if (nota4 >= nota1 && nota1 >= nota2 && nota3 >= nota2) {
			notaMenor = nota2;
			notaPrimera = nota1;
			notaSegunda = nota3;
			notaTercera= nota4;
		}
		
		//Hace la media
		double media = (notaPrimera * 0.3) + (notaSegunda * 0.3) + (notaTercera * 0.3);
		
		//Resultado muestra la nota eliminada y la media redondeada
		System.out.println("Tu nota eliminada: " + notaMenor);
		System.out.println("Tu media es de: " + (Math.round(media)));
	}

}
