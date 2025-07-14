package com.mycompany.multiplication;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);

        int num, mult;
        System.out.println("Input the number (Table to be calculated) : ");
        num = score.nextInt();

        for (int i = 1; i <= 10; i++) {
            mult = 1;
            mult = num * i;
            System.out.println(num + " * " + i + "=" + mult + "\n");
        }
    }
}
