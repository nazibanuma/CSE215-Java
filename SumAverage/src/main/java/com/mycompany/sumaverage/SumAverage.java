package com.mycompany.sumaverage;

import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        int sum = 0, nums;

        System.out.println("Input 10 integers: ");

        for (int i = 1; i <= 10; i++) {
            nums = num.nextInt();
            sum += nums;
        }
        System.out.println("the sum of 10 integers is " + sum);
    }
}
