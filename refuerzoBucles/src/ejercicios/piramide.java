package ejercicios;

import java.util.Scanner;

//Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de
//lado, utilizando para ello asteriscos (*). Por ejemplo, para n = 4,
//* * * *
//* * *
//* *
//*

public class piramide {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Introduzca numero de filas: ");
        numero = sc.nextInt();
        
        for (int i = 0; i < numero; i++) {
        	  for (int j = numero - i; j > 0; j--) {
        	    System.out.print("*");
        	  }
        	  System.out.println();
        	}
        
        sc.close();
    }
}

