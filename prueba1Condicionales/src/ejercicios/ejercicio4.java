package ejercicios;

import java.util.Scanner;

//Tiendas Don DAMITO desea un programa para ingresar por teclado el importe de compra
//y el día de la semana; si el día es martes o jueves, se realizará un descuento del 15%; si el
//día es lunes o miércoles, se realizará un descuento del 10% y si el día es viernes o sábado,
//se realizará un descuento del 5% por la compra. Visualizar el descuento y el total a pagar
//por la compra

public class ejercicio4 {

	public static void main(String[] args) {
		
		//Variables
		double importe;
		int dia;
		double descuento = 0;
		
		 Scanner sc = new Scanner(System.in);
		 
		 //Pide importe y día de la semana
		 System.out.println("Importe de la compra: ");
		 importe = sc.nextDouble();
		 
		 System.out.println("Día de la semana: ");
		 dia = sc.nextInt();
		 
		 //Resuelve que día es y otorga un descuento
		 switch	(dia) {
		 case 2,4: descuento = 0.15; break;
		 case 1,3: descuento = 0.1; break;
		 case 5,6: descuento = 0.5; break;
		 }
		 
		 //Calculos de la compra
		 double totalDescuento = importe * descuento;
		 double totalCompra = importe - totalDescuento;
		 
		 //Resultado
		 System.out.println("Sin descuento: " + importe);
		 System.out.println("A pagar: " + totalCompra);
		 
		 sc.close();

	}

}
