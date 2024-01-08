package ejercicios;

public class ejercicio1c {

	public static void main(String[] args) {

		boolean entrada_bucle = true;
		int numero = 5;
		
		do {
			System.out.println(numero);
			
			numero += 5;
			
			if (numero > 100) {
				entrada_bucle = false;
			} 
		} while (entrada_bucle == true);

	}

}
