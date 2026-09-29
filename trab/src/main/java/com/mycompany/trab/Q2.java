package com.mycompany.trab;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char[] ve = new char[6];
        int v = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Informe resultado do jogo");
            ve[i] = ler.next().charAt(0);

            if (ve[i] == 'v' || ve[i] == 'V') {
                v++;

            }
 }

        if (v >= 5) {
            System.out.println("1");

        } else if (v >= 3 && v <= 4) {
            System.out.println("2");

        } else if (v >= 1 && v <= 2) {
            System.out.println("1");

        } else {
            System.out.println("-1");

        }
    }

}
