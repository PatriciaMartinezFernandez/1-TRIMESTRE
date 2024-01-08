package ejercicios;

public class ejercicio1b {

	public static void main(String[] args) {

		boolean entrada_bucle = true;
		int numero = 5;
		
		while (entrada_bucle != false) {
			
			System.out.println(numero);
			
			numero += 5;
			
			if (numero > 100) {
				entrada_bucle = false;
			}
		}
	}
}