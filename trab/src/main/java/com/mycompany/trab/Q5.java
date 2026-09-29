package com.mycompany.trab;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int N1, D1, V1;
        int N2, D2, V2;

        N1 = ler.nextInt();
        D1 = ler.nextInt();
        V1 = ler.nextInt();

        N2 = ler.nextInt();
        D2 = ler.nextInt();
        V2 = ler.nextInt();

        if (D1 * V2 < D2 * V1) {
            System.out.println(N1);
        } else {
            System.out.println(N2);
        }

    }
}
