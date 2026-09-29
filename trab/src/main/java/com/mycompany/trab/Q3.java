
package com.mycompany.trab;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int S, A, B;
        int contador = 0;

        System.out.println("Informe a soma dos digitos:");
        S = ler.nextInt();

        System.out.println("Informe o primeiro numero:");
        A = ler.nextInt();

        System.out.println("Informe o segundo numero:");
        B = ler.nextInt();

        if (1 <= S && S <= 36
                && 1 <= A && A <= 10000
                && 1 <= B && B <= 10000
                && A <= B) {

            for (int i = A; i <= B; i++) {

                int numero = i;
                int soma = 0;

                while (numero > 0) {
                    soma = soma + numero % 10;
                    numero = numero / 10;
                }

                if (soma == S) {
                    contador++;
                }
            }

            System.out.println(contador);

        } else {
            System.out.println("Valores invalidos");
        }

        
    }
}
