package ejercicios;

public class OperacionesLocas {

	//calcula el maximo, necesita de la funcion maximo
	public static int maxTresNum(int num1, int num2, int num3) {
		
		return maximo(maximo(num1,num2),num3);
		
	}
	
	//si a es mayor se queda a
	public static int maximo(int a, int b) {

		if (a >= b) {
			return a;
		}
		
		else
			return b;
	}
	
	//calcula el minimo, necesita de la funcion minimo
	public static int minTresNum(int num1, int num2, int num3) {
		
		return minimo(minimo(num1,num2),num3);
		
	}
	
	//si a es mayor se queda con b
	public static int minimo(int a, int b) {

		if (a >= b) {
			return b;
		}
		
		else
			return a;
	}
	
	//máximo elevado a mínimo
	public static long potencia(int max, int min) {
		long resultado = 1;
		
		for (int i = min; i > 0;i--) {
            
			 resultado = resultado * max;
			
       }
		return resultado;
	}

	
	public static long factMaximo(int max) {
		long resultado = 1;
		
		for (long i = max; i > 0; i--) {
			
			resultado = resultado * i;
			
		}
		
		return resultado;
	}
	
	//factorial del min
	public static long factMinimo(int min) {
		long resultado = 1;
		
		for (long i = min; i > 0; i--) {
			
			resultado = resultado * i;
			
		}
		
		return resultado;
	}
	
	/**esPrimo Devuelve true si es primo el número que le pasamos como parámetro y
false en caso contrario. En nuestro programa lo invocaremos 2 veces, una
pasándole el número máximo obtenido y otra con el número mínimo.**/
	
	
	public static void main(String[] args) {

		int num1= (int) (Math.random()*(1-50)+50);
		int num2= (int) (Math.random()*(1-50)+50);
		int num3= (int) (Math.random()*(1-50)+50);
		
		int max = maxTresNum(num1,num2, num3);
		int min = minTresNum(num1,num2, num3);
		long potencia = potencia(max, min);
		long factorialMax = factMaximo(max);
		long factorialMin = factMinimo(min);
		
		System.out.println("==================================");
		System.out.println("1. Números aleatorios: " +num1);
		System.out.println("2. Números aleatorios: " +num2);
		System.out.println("3. Números aleatorios: " +num3);
		System.out.println("==================================");

		System.out.println("\n" + "==================================");
		System.out.println("El número máximo es: " + max);
		System.out.println("El número mínimo es: " + min);
		System.out.println("==================================");
		
		System.out.println("\n" + "==================================");
		System.out.println(max + " elevado a " + min + " es igual a " + potencia);
		System.out.println("==================================");
		
		System.out.println("\n" + "==================================");
		System.out.println("Máximo -> El factorial de " + max + " es " + factorialMax);
		System.out.println("Mínimo -> El factorial de " + min + " es " + factorialMin);
		System.out.println("==================================");
		
		
	}

}
