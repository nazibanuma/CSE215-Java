package com.mycompany.admission;

import java.util.Scanner;

public class Admission {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        float math = num.nextFloat();
        float phy = num.nextFloat();
        float chem = num.nextFloat();

        System.out.println("Take an input: " + math + phy + chem);

        float Total = math + phy + chem;
        float TotalMP = math + phy;

        if (Total >= 190 && TotalMP >= 140) {
            System.out.println("they are eligible");
        } else {
            System.out.println("they are NOT eligible");
        }
    }
}
