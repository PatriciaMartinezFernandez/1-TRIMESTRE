package ejercicio;

public class ejercicio5 {

    public static void main(String[] args) {
    	// Mi variable tiene el valor minimo
    	short rango = -32768;
    	System.out.println("Mi variable vale: " + rango);

    	// Aqui mi variable pasa a tener el valor maximo
    	rango -= 1;
    	System.out.println("Su valor máximo es: " + rango);

    	// Y por ultimo, vuelve a tener el valor minimo
    	rango += 1;
    	System.out.println("Su valor mínimo es: " + rango);
    }
} 

