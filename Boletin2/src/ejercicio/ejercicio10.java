package ejercicio;

import java.util.Scanner;

public class ejercicio10 {
	public static void main(String[] args) {
		
		double precioPera;
		double precioManzana;
		double kilosManzanas1;
		double kilosPeras1;
		double kilosManzanas2;
		double kilosPeras2;
		double kilosManzanas3;
		double kilosPeras3;
		double kilosManzanas4;
		double kilosPeras4;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuánto valen las peras?");
		precioPera = sc.nextDouble();
		
		System.out.println("¿Cuánto valen las manzanas?");
		precioManzana = sc.nextDouble();
		
		
		//1 trimestre
		System.out.println("¿Cuántos kilos de manzanas quieres comprar en el 1º Trimestre?");
		kilosManzanas1 = sc.nextDouble();
		System.out.println("¿Cuántas kilos de peras quieres comprar en el 1º Trimestre?");
		kilosPeras1 = sc.nextDouble();
		
		double totalManzanas1 = precioManzana * kilosManzanas1;
		double totalPeras1 = precioPera * kilosPeras1;
		double trimestre1 = totalManzanas1 + totalPeras1;
		
		System.out.println("=====================================");
		System.out.println("Beneficio 1º Trimestre:");
		System.out.println("Manzanas: " + totalManzanas1);
		System.out.println("Peras: " + totalPeras1);
		System.out.println("TOTAL: " + trimestre1);
		System.out.println("=====================================");
		
		//2 trimestre
		System.out.println("¿Cuántos kilos de manzanas quieres comprar en el 2º Trimestre?");
		kilosManzanas2 = sc.nextDouble();
		System.out.println("¿Cuántas kilos de peras quieres comprar en el 2º Trimestre?");
		kilosPeras2 = sc.nextDouble();
		
		double totalManzanas2 = precioManzana * kilosManzanas2;
		double totalPeras2 = precioPera * kilosPeras2;
		double trimestre2 = totalManzanas2 + totalPeras2;
		
		System.out.println("=====================================");
		System.out.println("Beneficio 2º Trimestre:");
		System.out.println("Manzanas: " + totalManzanas2);
		System.out.println("Peras: " + totalPeras2);
		System.out.println("TOTAL: " + trimestre2);
		System.out.println("=====================================");
		
		//3 trimestre
		System.out.println("¿Cuántos kilos de manzanas quieres comprar en el 3º Trimestre?");
		kilosManzanas3 = sc.nextDouble();
		System.out.println("¿Cuántas kilos de peras quieres comprar en el 3º Trimestre?");
		kilosPeras3 = sc.nextDouble();
		
		double totalManzanas3 = precioManzana * kilosManzanas3;
		double totalPeras3 = precioPera * kilosPeras3;
		double trimestre3 = totalManzanas3 + totalPeras3;
		
		System.out.println("=====================================");
		System.out.println("Beneficio 3º Trimestre:");
		System.out.println("Manzanas: " + totalManzanas3);
		System.out.println("Peras: " + totalPeras3);
		System.out.println("TOTAL: " + trimestre3);
		System.out.println("=====================================");
		
		//4 trimestre
		System.out.println("¿Cuántos kilos de manzanas quieres comprar en el 4º Trimestre?");
		kilosManzanas4 = sc.nextDouble();
		System.out.println("¿Cuántas kilos de peras quieres comprar en el 4º Trimestre?");
		kilosPeras4 = sc.nextDouble();
		
		double totalManzanas4 = precioManzana * kilosManzanas4;
		double totalPeras4 = precioPera * kilosPeras4;
		double trimestre4 = totalManzanas4 + totalPeras4;
		
		System.out.println("=====================================");
		System.out.println("Beneficio 4º Trimestre:");
		System.out.println("Manzanas: " + totalManzanas4);
		System.out.println("Peras: " + totalPeras4);
		System.out.println("TOTAL: " + trimestre4);
		System.out.println("=====================================");
		
		double totalAnual = trimestre1 + trimestre2 + trimestre3 + trimestre4;
		
		System.out.println("=====================================");
		System.out.println("Total Anual:");
		System.out.println("1º Trimestre: " + trimestre1);
		System.out.println("2º Trimestre: " + trimestre2);
		System.out.println("3º Trimestre: " + trimestre3);
		System.out.println("4º Trimestre: " + trimestre4);
		System.out.println("TOTAL ANUAL: " + totalAnual);
		System.out.println("=====================================");
		
		sc.close();
	}
}
