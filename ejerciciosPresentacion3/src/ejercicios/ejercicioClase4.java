package ejercicios;

import java.util.Scanner;

public class ejercicioClase4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cantidadKg;
		int tipoCliente;
		final double IVA = 0.21;
		final double PRECIO_KG = 3.5;
		final double DESCUENTO_10 = 0.10;
		final double DESCUENTO_15 = 0.15;
		final double DESCUENTO_25 = 0.25;
		final double DESCUENTO_40 = 0.40;
		final int PARTICULAR = 1;
		final int EMPRESA = 2;
		
		System.out.println("Cantidad de kg");
		cantidadKg = sc.nextInt();
		
		System.out.println("Indica: Particular(1) o Empresa(2)");
		tipoCliente = sc.nextInt();
		
		double sinDescuento = (cantidadKg * PRECIO_KG);
		double conDescuento10 = (sinDescuento) * DESCUENTO_10;
		double conDescuento15 = (sinDescuento) * DESCUENTO_15;
		double conDescuento25 = (sinDescuento) * DESCUENTO_25;
		double conDescuento40 = (sinDescuento) * DESCUENTO_40;
		double conIva0 = sinDescuento * IVA;
		double conIva10 = (sinDescuento - conDescuento10) * IVA;
		double conIva15 = (sinDescuento - conDescuento15) * IVA;
		double conIva25 = (sinDescuento - conDescuento25) * IVA;
		double conIva40 = (sinDescuento - conDescuento40) * IVA;
		double precioTotal0 = sinDescuento + conIva0;
		double precioTotal10 = sinDescuento + conIva10;
		double precioTotal15 = sinDescuento + conIva15;
		double precioTotal25 = sinDescuento + conIva25;
		double precioTotal40 = sinDescuento + conIva40;
		
		if (tipoCliente == EMPRESA && cantidadKg >= 100 || (tipoCliente == PARTICULAR && cantidadKg >= 120)) {
			System.out.println("Precio sin descuento: " + sinDescuento);
			System.out.println("Precio con descuento 40%: " + conDescuento40);
			System.out.println("Precio con IVA: " + conIva40);
			System.out.println("Precio total: " + precioTotal40);
		}
		
		else if (tipoCliente == EMPRESA && cantidadKg >= 50 || (tipoCliente == PARTICULAR && cantidadKg >= 60)) {
			System.out.println("Precio sin descuento: " + sinDescuento);
			System.out.println("Precio con descuento 25%: " + conDescuento25);
			System.out.println("Precio con IVA: " + conIva25);
			System.out.println("Precio total: " + precioTotal25);
		}
		
		else if (tipoCliente == EMPRESA && cantidadKg >= 25 || (tipoCliente == PARTICULAR && cantidadKg >= 30)) {
			System.out.println("Precio sin descuento: " + sinDescuento);
			System.out.println("Precio con descuento 15%: " + conDescuento15);
			System.out.println("Precio con IVA: " + conIva15);
			System.out.println("Precio total: " + precioTotal15);
		}
		
		else if (tipoCliente == EMPRESA && cantidadKg >= 10 || (tipoCliente == PARTICULAR && cantidadKg >= 12)) {
			System.out.println("Precio sin descuento: " + sinDescuento);
			System.out.println("Precio con descuento 10%: " + conDescuento10);
			System.out.println("Precio con IVA: " + conIva10);
			System.out.println("Precio total: " + precioTotal10);
		} 
		
		else if (tipoCliente == EMPRESA && cantidadKg < 10 || (tipoCliente == PARTICULAR && cantidadKg < 12)) {
			System.out.println("Precio sin descuento: " + sinDescuento);
			System.out.println("Precio con IVA: " + conIva0);
			System.out.println("Precio total: " + precioTotal0);
		}	
		
		sc.close();
		
	}
}
