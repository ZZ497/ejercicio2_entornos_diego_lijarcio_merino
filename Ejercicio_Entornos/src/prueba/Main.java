package prueba;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Numero 1: ");
        int a = sc.nextInt();
        
        System.out.print("Numero 2: ");
        int b = sc.nextInt();
     
        int resultado = a + b;
         
        if (resultado % 2 == 0) {
        	System.out.print("Es par");
        } else {
        	System.out.print("Es impar");
        }
      
    }

}
