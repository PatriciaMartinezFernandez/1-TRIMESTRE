package ejercicios;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		
		float Mb;
		float Kb;
		final int MIL = 1000;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuántos Mb quieres pasar a Kb?");
		Mb = sc.nextFloat();
		
		float MbAKb = Mb * MIL;
		
		System.out.println("Resultado: " + MbAKb);
		
		System.out.println("Cuántos Kb quieres pasar a Mb?");
		Kb = sc.nextFloat();
		
		float KbAMb = Kb / MIL;
		
		System.out.println("Resultado: " + KbAMb);
		
		sc.close();
		
	}
}
