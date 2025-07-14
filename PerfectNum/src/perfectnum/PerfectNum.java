package perfectnum;

import java.util.Scanner;

public class PerfectNum {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = number.nextInt();
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (num == sum) {
            System.out.println("Its a perfect number");
        } else {
            System.out.println("Its not a perfect number");
        }

    }
