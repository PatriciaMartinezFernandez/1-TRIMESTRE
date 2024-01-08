package ejercicios;

import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        
        int numero, factorial = 1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame un número:");
        numero = sc.nextInt();
        
        for (int i = numero; i > 0;i--) {
            
            factorial = factorial * i;
            
            if (i == 1) {
                System.out.println(i + " = " + factorial);
            }
            else {
                System.out.print(i + " x ");                
            }
            
        }
        
        sc.close();
    }

}