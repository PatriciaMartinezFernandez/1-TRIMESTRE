package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	public static void main(String[] args) {
		
		float baseImponible;
		final int IVA = 21;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe la base imponible");
		baseImponible = sc.nextFloat();
		
		float aplicacionIva = baseImponible / IVA;
		float formula = baseImponible + aplicacionIva;
		
		System.out.println("Este es el total de tu factura " + formula);
		
		sc.close();
		
	}
}

