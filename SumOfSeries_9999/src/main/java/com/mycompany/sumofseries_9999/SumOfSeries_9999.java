package com.mycompany.sumofseries_9999;

import java.util.Scanner;

public class SumOfSeries_9999 {

    public static void main(String[] args) {
        int term = 5,sum1=0;

        for (int i = 1,j=0; i <= term; i++) {

            j = j * 10 + 9;
            sum1 = sum1 + j;
        }
        System.out.println(sum1);

        double sum2=0,x=2;
        
        for(int i=1,j=1;i<=term;i++,j+=2){
            sum2 = Math.pow(x, j);
        }
         System.out.println(sum2);
    }
}
