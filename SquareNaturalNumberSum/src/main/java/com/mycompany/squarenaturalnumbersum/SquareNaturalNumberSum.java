package com.mycompany.squarenaturalnumbersum;

import java.util.Scanner;

public class SquareNaturalNumberSum {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int n = 5, term;

        for (int i = 1; i <= n; i++) {
            term=1;
            term = i * i;
            System.out.println(term);
        }

    }
}
