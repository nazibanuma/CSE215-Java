package com.mycompany.sumofseries;

import java.util.Scanner;

public class SumOfSeries {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int x, term, fact = 1;
        float sum = 1;
        System.out.println("Input the value of x: ");
        x = number.nextInt();

        System.out.println("Input the value of powers: ");
        term = number.nextInt();

        for (int i = 2, j = 2; i <= term; i++, j += 2) {
            for (int k = 1; k <= j; k++) {
                fact *= i;
            }

            if (i % 2 == 0) {
                sum = (int)(sum - (Math.pow(x, j)) )/ fact;
              
        }
        else
        {
            sum = sum + (Math.pow(x, j) / fact);
            
        }

        }
        System.out.println(sum);
    }
