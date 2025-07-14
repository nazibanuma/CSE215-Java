package methodhomework;

import java.util.Scanner;

public class MethodHomework {

    public static double SumOfSquares(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + Math.pow(n, 2);
        }
        return sum;
    }

    public static int Math(int m, int n) {
        int max;
        if (m > n) {
            max = m;
        } else {
            max = n;
        }
        return max;
    }
    
    public static int fibonacci(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }
    
    public static double priceCalculation(double price) {
        return price + (price / 2);
    }

    public static double priceCalculation(double price1, double price2) {
        return price1 + price2;
    }

    public static double priceCalculation(double price1, double price2, double price3) {
        double total = price1 + price2 + price3;
        if (total < 200) {
            total += 50;
        } else if (total > 400) {
            total -= 50;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //problem 1
        System.out.println("Enter an integer: ");
        int n = input.nextInt();

        double result = SumOfSquares(n);
        System.out.println("The sum of square is: " + result);

        //problem 2
        System.out.println("Enter 1st integer: ");
        int a = input.nextInt();
        System.out.println("Enter 2nd integer: ");
        int b = input.nextInt();

        int max = Math(a, b);
        System.out.println("The max between two digits are: " + max);

        //problem 3
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.println("The summation is: " + sum);

        int maxi = array[0];
        for (int i = 1; i < 10; i++) {
            if(array[i]>max){
                maxi = array[i];
            }
        }
        System.out.println("The maximum value is : "+maxi);

        //problem 4
        //there was no pattern printing exercise given. what should i do?
   
        //problem 5
        System.out.print("Enter term number: ");
        int term = input.nextInt();

        for (int i = 0; i <= term - 1; i++) {

            System.out.print(fibonacci(i) + " ");

        }
        
        //problem 6
        double temp;
        double[] array1 = {21, 37, 48, 56, 9, 3, 59, 72, 1, 109};
        for (int i = 0; i < 10 - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < 10; j++) {
                if (array1[smallest] > array1[j]) {
                    smallest = j;
                }
            }
            temp = array1[smallest];
            array1[smallest] = array1[i];
            array1[i] = temp;

        }
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("");
        
        //problem 7
        
        double result1 = priceCalculation(100);
        double result2 = priceCalculation(80, 90);
        double result3 = priceCalculation(150, 100, 200);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        }

    }
