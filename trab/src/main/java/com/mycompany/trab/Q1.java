package com.mycompany.trab;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;

        System.out.println("Informe a idade");
        a = ler.nextInt();

        System.out.println("Informe a idade");
        b = ler.nextInt();

        System.out.println("Informe a idade");
        c = ler.nextInt();

        if (5 <= a && a <= 100
                && 5 <= b && b <= 100
                && 5 <= c && c <= 100) {

            if (a > b && b > c || b > a && c > b) {
                System.out.println("A idade da Camila e" + b);
            } else if (b > a && a > c || a > b && c > a) {
                System.out.println("A idade da Camila e:" + a);
            } else {
                System.out.println("A idade da Camila e:" + c);

            }
        } else {
            System.out.println("Idade invalida");

        }
    }

}
