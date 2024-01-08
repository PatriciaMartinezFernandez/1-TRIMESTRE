package ejercicios;

import java.util.Scanner;

public class ejercicioCaracoles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tipoCliente;
		int cantidadKg;
		final double PRECIO_KG = 3.5;
		final double IVA = 0.21;
		final int EMPRESA = 2;
		final int PARTICULAR = 1;
		double descuento = 0;
		
		System.out.println("Indica: Particular(1) o Empresa(2)");
		tipoCliente = sc.nextInt();
		
		System.out.println("Cantidad de kg");
		cantidadKg = sc.nextInt();
		sc.close();
		
		//Empresario o Particular & kilos
		if (tipoCliente == EMPRESA && cantidadKg >= 100 || (tipoCliente == PARTICULAR && cantidadKg >= 120)) {
			descuento = 0.40;
		}
		
		if (tipoCliente == EMPRESA && cantidadKg >= 50 || (tipoCliente == PARTICULAR && cantidadKg >= 60)) {
			descuento = 0.25;
		}

		if (tipoCliente == EMPRESA && cantidadKg >= 25 || (tipoCliente == PARTICULAR && cantidadKg >= 30)) {
			descuento = 0.15;
		}

		if (tipoCliente == EMPRESA && cantidadKg >= 10 || (tipoCliente == PARTICULAR && cantidadKg >= 12)) {
			descuento = 0.10;
		}
		
		//calculos
		double sinDescuento = cantidadKg * PRECIO_KG;
		double aplicarDescuento = sinDescuento * descuento;
		double conDescuento = sinDescuento - aplicarDescuento;
		double conIva = conDescuento * IVA;
		double precioFinal = conDescuento + conIva;
		
		System.out.println("Este es tu precio sin descuento: " + sinDescuento);
		System.out.println("Este es tu precio con descuento: " + conDescuento);
		System.out.println("Este es tu precio con IVA: " + conIva);
		System.out.println("Este es tu precio final: " + precioFinal);
		
		
	}
}
