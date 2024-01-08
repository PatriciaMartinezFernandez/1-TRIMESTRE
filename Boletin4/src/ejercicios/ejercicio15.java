package ejercicios;

import java.util.Scanner;

//  Realizar un programa que nos pida un número n, y nos diga cuántos números hay entre
//1 y n que sean primos. Un número primo es aquél que sólo es divisible por 1 y por él
//mismo. Veamos un ejemplo para n = 8:
//comprobamos todos los números del 1 al 8:
//1 → primo
//2 → primo
//3 → primo
//4 → no primo
//5 → primo
//6 → no primo
//7 → primo
//8 → no primo
//Resultando un total de 5 números primos.

public class ejercicio15 {

	public static void main(String[] args) {

		int num = 0;
        
        boolean primo;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            
            primo = true;

            for (int j = 2; j < i; j++) {
          
                if (i % j == 0)
                    primo = false;
            }

            if (primo) {
                System.out.println(i + " -> primo");
            } else {
                System.out.println(i + " -> no primo");
            }
        }
        
        sc.close();
    }
}