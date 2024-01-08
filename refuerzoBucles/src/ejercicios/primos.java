package ejercicios;

import java.util.Scanner;

public class primos {

    public static void main(String[] args) {
        
        int numero;
        boolean primo = true;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame un número:");
        numero = sc.nextInt();
                
        for (int i = 1; i <= numero; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                
                if (i % j == 0) {
                    primo = false;
                }
                
            }
            
            /**if (i == 1) {
                System.out.println(i + " -> no es primo");

            }**/
            
            if (primo == true) {
                System.out.println(i + " -> es primo");
            }
            
            /**else {
                System.out.println(i + " -> no es primo");
            }**/
        }
        sc.close();
    }

}