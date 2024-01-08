package ejercicios;

//Algoritmo que suma independientemente los números pares e impares comprendidos
//entre 25 y 50, y muestra por pantalla el resultado de las sumas. (hacer con while y con for)

public class ejercicio7b {
	public static void main(String[] args) {
        
        int min = 25, max = 50;
        int sumaPar = 0, sumaImpar = 0;

        for (int i = min; i <= max; i++) {
                        
            if ( i % 2 == 0) {
            	sumaPar = sumaPar + i;
            }
            
            else {
            	sumaImpar = sumaImpar + i;
            }
        }
        
        System.out.println("Suma Par: " + sumaPar);
        System.out.println("Suma Impar: " + sumaImpar);
    }
}
