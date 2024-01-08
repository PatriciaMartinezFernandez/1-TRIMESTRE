package ejercicios;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		//Escribe un programa que calcule el precio final de un producto según su base
		//imponible (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o
		//superreducido) y el código promocional. Los tipos de IVA general, reducido y
		//superreducido son del 21%, 10% y 4% respectivamente. Los códigos promocionales
		//pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente que no se
		//aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o se
		//descuenta el 5%.
		
		Scanner sc = new Scanner(System.in);
		
		double baseImponible;
		double iva;
		double promocion;
		
		System.out.println("Introduce el precio del producto:");
		baseImponible = sc.nextDouble();
		
		System.out.println("Introduce el tipo de IVA: IVA General (1), IVA Reducido(2), IVA Superreducido(3)");
		iva = sc.nextDouble();
		
		System.out.println("Introduce el tipo de promoción: No Promoción(1), Mitad(2), Menos 5€(3), 5% descuento(4)");
		promocion = sc.nextDouble();
		
		if (iva == 1) { //iva general
			iva = 0.21;
		}
		else if (iva == 2) { //iva reducido
			iva = 0.10;
		}
		
		else if (iva == 3) { //iva superreducido
			iva = 0.04;
		}
		
		else {
			System.out.println("Error");
		}
		
		double precioIVA = baseImponible * iva;
		
		if (promocion == 1) { //no promocion
			promocion = precioIVA;
		}
		else if (promocion == 2) { //mitad
			promocion = precioIVA / 2;
		}
		
		else if (promocion == 3) { //menos 5
			promocion = precioIVA - 5;
		}
		
		else if (promocion == 3) { //5%
			promocion = precioIVA * 0.5;
		}
		
		else {
			System.out.println("Error");
		}
		
		//FACTURA
		System.out.println("==========================================");
		System.out.println("Precio del producto: " + baseImponible + "€");
		System.out.println("Precio con IVA: " + precioIVA + "€");
		System.out.println("Precio con promocion: " + promocion + "€");
		System.out.println("==========================================");
		
		sc.close();
	}

}
