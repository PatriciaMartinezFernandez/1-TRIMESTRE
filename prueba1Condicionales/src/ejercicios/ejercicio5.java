package ejercicios;

import java.util.Scanner;

//Una compañía dedicada al alquiler de automóviles cobra una cantidad fijo de 200€ para
//los primeros 300 km de recorrido. Para más de 300 km y hasta 1000 km, cobra un coste
//adicional de 0.30€ por cada kilómetro en exceso sobre 300. Para más de 1000 km cobra un
//monto adicional de 0.15€ por cada kilómetro en exceso sobre 1000 km.
//Si el cliente es usuario vip de la compañía se le aplica un 5% de descuento.
//El precio final debe incluir el 21% del impuesto general a las ventas, IVA.
//Diseñe un algoritmo que determine el precio a pagar por el alquiler de un vehículo y el total
//incluido el impuesto.

public class ejercicio5 {

	public static void main(String[] args) {

		//Variables y constantes
		double km;
		double precioIva, precioConIva, precioAlquiler = 0;
		final int COBRO_FIJO = 200; //primeros 300km
		final double ADICIONAL1 = 0.30; // de 300km - 1000km
		final double ADICIONAL2 = 0.15; // más de 1000km
		final double IVA = 0.21; 
		
		Scanner sc = new Scanner(System.in);
		
		//Pide km
		System.out.println("¿Cuántos kilómetros has recorrido con el vehículo?");
		km = sc.nextDouble();
		
		//Resuelve si hay que añadir al importe
		if (km > 1000) {
			precioAlquiler = km * ADICIONAL2;
		}
		
		else if (km >= 300 && km <= 1000) {
			precioAlquiler = km * ADICIONAL1;
		}
		
		else if (km > 0 && km < 300) {
			precioAlquiler = COBRO_FIJO;
		}
		
		else {
			System.out.println("error");
		}
		
		//Calculos factura
		precioIva = precioAlquiler * IVA;
		precioConIva = precioAlquiler + precioIva;
		
		//Resultado
		System.out.println("Importe (sin IVA): " + precioAlquiler);
		System.out.println("Importe total (con IVA): " + precioConIva);
		
		sc.close();
	}

}
