package ejercicios;

//Programa que muestre por pantalla los números enteros comprendidos entre 5 y 100,
//ambos inclusive, que sean múltiplos de 5. Empezamos por el 5 y terminamos por el 100.
//Realiza 3 versiones del programa usando el bucle while, do while y for. ¿Cuál es el tipo de
//bucle más adecuado para realizar este ejercicio y por qué?

public class ejercicio1 {

	public static void main(String[] args) {

		for (int i = 5; i <= 100; i+=5) {
			System.out.println(i);
		}
	}
}
