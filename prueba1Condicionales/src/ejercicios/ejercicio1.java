package ejercicios;

//Realiza un programa que genere un número entero aleatorio y muestre por pantalla el
//número y la siguiente información: si es negativo o no y múltiplo de 3 o si no lo es.


public class ejercicio1 {

	public static void main(String[] args) {
		
		//Variable aleatoria comprendida entre -10 y 10
		int numAleatorio= (int) (Math.random()*(-10-10)+10);
		
		//Muestra el numero
		System.out.println("Este es el número aleatorio: " + numAleatorio);
		
		
		//Resuelve si es múltiplo de 3, negativo y/o positivo
		if (numAleatorio % 3 == 0) {
			System.out.println("Es múltiplo de 3");
		}
		
		if (numAleatorio < 0) {
			System.out.println("El número es negativo");
		}
		
		if (numAleatorio > 0) {
			System.out.println("El número es positivo");
		}
	
	}

}
