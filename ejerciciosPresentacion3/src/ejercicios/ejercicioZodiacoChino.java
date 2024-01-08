package ejercicios;

import java.util.Scanner;

public class ejercicioZodiacoChino {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anio;
	
		System.out.println("Introduce un año:");
		anio = sc.nextInt();
		
		switch (anio % 12) {
			case 0:
				System.out.println("Año del mono");
				break;
				
			case 1:
				System.out.println("Año del gallo");
				break;
				
			case 2:
				System.out.println("Año del perro");
				break;
				
			case 3:
				System.out.println("Año del cerdo");
				break;
				
			case 4:
				System.out.println("Año del rata");
				break;
				
			case 5:
				System.out.println("Año del buey");
				break;
				
			case 6:
				System.out.println("Año del tigre");
				break;
			
			case 7:
				System.out.println("Año del conejo");
				break;
				
			case 8:
				System.out.println("Año del dragon");
				break;
				
			case 9:
				System.out.println("Año del serpiente");
				break;
				
			case 10:
				System.out.println("Año del caballo");
				break;
				
			case 11:
				System.out.println("Año del oveja");
				break;
		}
		
		sc.close();

	}

}
