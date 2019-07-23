
package javaapplication25;

import java.util.Scanner;

public class JavaApplication25 {
void cribadeEratostenes(int n)
    {
        
        boolean primo[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            primo[i] = true;
        for(int p = 2; p*p <=n; p++)
        {
            
            if(primo[p] == true) //si cambia entonces no es primo
            {
                
                for(int i = p*2; i <= n; i += p)//multiplos
                    primo[i] = false;
            }
        }
        
        for(int i = 2; i <= n; i++) //imprimir
        {
            if(primo[i] == true)
                System.out.print(i + " ");
        }
    }
   
    public static void main(String[] args) {
        int n ;
        System.out.println ("Criba de Eratóstenes");
        System.out.println ("Ingrese NÚMERO");
         Scanner entradaEscaner = new Scanner (System.in);
         n = entradaEscaner.nextInt();
         
        System.out.print("Los siguientes son los números primos ");
        System.out.println("menores o igual que " + n);
        JavaApplication25 g = new JavaApplication25();
        g.cribadeEratostenes(n);
    }
    
}
