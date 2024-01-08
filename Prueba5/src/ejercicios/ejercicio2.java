package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	static Scanner sc = new Scanner(System.in);

	public static void imprimeMatriz(double matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}

	}

	public static double[][] rellenaMatriz(double matriz[][]) {

		double litros;

		System.out.println("Introduce los litros: ");

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print("[Producto" + i + "]" + "[Día" + j + "] = ");
				litros = sc.nextDouble();

				matriz[i][j] = litros;
			}

		}

		return matriz;

	}

	public static double mediaProducto(double arr[]) {

		final int TOTAL_PRODUCTOS = 5;

		double sumaLitros = 0, mediaProducto;

		for (int i = 0; i < arr.length; i++) {
			sumaLitros += arr[i];
		}

		mediaProducto = sumaLitros / TOTAL_PRODUCTOS;

		return mediaProducto;

	}

	public static double sumaLitros(double arr[]) {

		double sumaLitros = 0;

		for (int i = 0; i < arr.length; i++) {
			sumaLitros += arr[i];
		}

		return sumaLitros;

	}
	
	public static double[][] transpose(double matriz[][]) {

		double[][] matrizT = new double[matriz[0].length][matriz[0].length];

		for (int i = 0; i < matriz[0].length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matrizT[i][j] = matriz[j][i];
			}
		}

		return matrizT;
	}
	

	public static void masMenosLitrosDia(double[][] arr) {
		
		arr = transpose(arr);

		double mayorLitros = 0;
		double mayorProducto = 0;
		String producto = " ";

		for (int i = 0; i < arr.length; i++) {
			
			mayorLitros = 0;
			
			for (int j = 0; j < arr[0].length; j++) {
				
				if (arr[i][j] > mayorProducto) {
					mayorProducto = j+1;
					mayorLitros = arr[i][j];
					
				}

				if (mayorProducto == 5) {
					producto = "Producto4";
				} else if (mayorProducto == 4) {
					producto = "Producto3";
				} else if (mayorProducto == 3) {
					producto = "Producto2";
				} else if (mayorProducto == 2) {
					producto = "Producto1";
				} else {
					producto = "Producto0";
				}

			}
			switch (i) {
			case 0:
				System.out.println("El producto más vendido del lunes fue " + producto + " con un total de "
						+ mayorLitros + " litros");
				break;
			case 1:
				System.out.println("El producto más vendido del martes fue " + producto + " con un total de "
						+ mayorLitros + " litros");
				break;
			case 2:
				System.out.println("El producto más vendido del miércoles fue " + producto + " con un total de "
						+ mayorLitros + " litros");
				break;
			case 3:
				System.out.println("El producto más vendido del jueves fue " + producto + " con un total de "
						+ mayorLitros + " litros");
				break;
			case 4:
				System.out.println("El producto más vendido del viernes fue " + producto + " con un total de "
						+ mayorLitros + " litros");
				break;
			case 5:
				System.out.println("El producto más vendido del sábado fue " + producto + " con un total de "
						+ mayorLitros + " litros");
				break;

			}

		}
	}

	public static void main(String[] args) {

		double[][] semana = new double[6][5];

		int litrosVendidosProducto;

		rellenaMatriz(semana);

		System.out.println("\n=====================================");
		System.out.println("Media producto 1: " + mediaProducto(semana[0]) + " litros");
		System.out.println("Media producto 2: " + mediaProducto(semana[1]) + " litros");
		System.out.println("Media producto 3: " + mediaProducto(semana[2]) + " litros");
		System.out.println("Media producto 4: " + mediaProducto(semana[3]) + " litros");
		System.out.println("Media producto 5: " + mediaProducto(semana[4]) + " litros");
		System.out.println("=====================================");

		System.out.println("\n¿De qué producto quieres ver la cantidad de litros vendido?");
		litrosVendidosProducto = sc.nextInt();

		switch (litrosVendidosProducto) {
		case 1:
			System.out.println("Litros vendidos de producto 1: " + sumaLitros(semana[0]) + " litros");
			break;
		case 2:
			System.out.println("Litros vendidos de producto 2: " + sumaLitros(semana[1]) + " litros");
			break;
		case 3:
			System.out.println("Litros vendidos de producto 3: " + sumaLitros(semana[2]) + " litros");
			break;
		case 4:
			System.out.println("Litros vendidos de producto 4: " + sumaLitros(semana[3]) + " litros");
			break;
		case 5:
			System.out.println("Litros vendidos de producto 5: " + sumaLitros(semana[4]) + " litros");
			break;
		}

		System.out.println("\n");

		masMenosLitrosDia(semana);
		
		imprimeMatriz(semana);
		
	}

}
