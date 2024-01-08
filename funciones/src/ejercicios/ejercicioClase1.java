package ejercicios;

public class ejercicioClase1 {

	public static int sum(int i1, int i2) {
		int resultado = 0;
		for (int i = i1; i <= i2; i++) {
			resultado += i;
		}
		return resultado;
	}
	
	public static void main(String[] args) {
		System.out.println("Resultado de 1 a 10 es " + sum(1, 10));
		System.out.println("Resultado de 20 a 30 es " + sum(20, 30));
		System.out.println("Resultado de 35 a 45 es " + sum(35, 45));

	}

}
