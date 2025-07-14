package com.mycompany.rightanglecol;

import java.util.Scanner;

public class RightAngleCol {

    public static void main(String[] args) {
        Scanner angle = new Scanner(System.in);

        int row;
        System.out.println("Enter row num:");
        row = angle.nextInt();

//        for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println(" ");
//        }
//         for (int i = 1; i <= row; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println(" ");
//        }
             
           int k=1;
         for (int i = 1; i <= row; i++) {
             for (int j = row - i; j >=1 ; j--){
                
                System.out.print(" ");
               
            }
            for (int j = 1; j <= i; j++){
                
                System.out.print(k++ + " ");
               
            }
            System.out.println(" ");
        }
         
    }
}
