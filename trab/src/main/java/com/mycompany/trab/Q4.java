
package com.mycompany.trab;

import java.util.Scanner;


public class Q4 {

  
    public static void main(String[] args) {
             Scanner ler = new Scanner(System.in);

        int N;
        int r;

        System.out.println("Informe o valor de N:");
        N = ler.nextInt();

        if (N >= 0 && N<=12) {
            r = (N + 1) * (N + 2) / 2;

            System.out.println(r);
        } else {
            System.out.println("Valor invalido");
        }

       
    }
}
    
    


