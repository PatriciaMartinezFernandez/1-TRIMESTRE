package ejercicios;

import java.util.Scanner;

//Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál
//es el árbol más alto. Para ello se introducirá por teclado la altura (en centímetros) de
//cada árbol (terminando cuando se utilice –1 como altura). Los árboles se identifican
//mediante etiquetas con números únicos correlativos, comenzando en 0. Se pide diseñar
//una aplicación que resuelva el problema planteado.

public class ejercicio9 {

	public static void main(String[] args) {

		int tamanioArbol;
		int etiqueta = -1;
		int etiquetafinal = -1;
		int arbolMasAlto = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tamaño del arból en cm: ");
		tamanioArbol = sc.nextInt();
		
		while (tamanioArbol != -1) {
			
			etiqueta++;
			System.out.println("Etiqueta #" + etiqueta + ", mide " + tamanioArbol);
			
			if (tamanioArbol > arbolMasAlto) {
				etiquetafinal++;
				arbolMasAlto = tamanioArbol;
			}
			
			System.out.println("Tamaño del siguiente arból en cm: ");
			tamanioArbol = sc.nextInt();
		}
		
		System.out.println("=======================================");
		System.out.println("El arból más alto es:");
		System.out.println("Etiqueta #" + etiquetafinal + ", mide " + arbolMasAlto);
		
		sc.close();

	}

}
