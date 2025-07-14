package arrayhomework1;

import java.util.Scanner;

public class ArrayHomework1 {

    public static int fibonacci(int a) {
        if (a == 0) {
            return 0;
        } else if (a == 1) {
            return 1;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //problem 1
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum amount is: " + sum);

        //problem 2
        System.out.print("Enter term  number: ");
        int term = input.nextInt();

        for (int i = 0; i <= term - 1; i++) {

            System.out.print(fibonacci(i) + " ");

        }

        //problem 3
        double temp;
        double[] array = {21, 37, 48, 56, 9, 3, 59, 72, 1, 109};
        for (int i = 0; i < 10 - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < 10; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;

        }
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        //problem 4
        int[] arr = new int[10];
        System.out.println("Enter 10 array elements");

        for (int i = 0; i < 10; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();

        }
        int sum1 = 0;

        for (int i = 0; i < 10; i++) {
            sum1 = sum1 + arr[i];
        }
        double average = (double) sum1 / 10;
        System.out.println("The average value of the array: " + average);

        //problem 5
        int[][] arrray = {{4, 2, 7, 6}, {3, 7, 9, -5}, {2, 12, 3, 2}, {-1, 4, -3, 9}};
        System.out.println("Sum of 1st row = " + (arrray[0][0] + arrray[0][1] + arrray[0][2] + arrray[0][3]));
        System.out.println("Sum of 2nd row = " + (arrray[1][0] + arrray[1][1] + arrray[1][2] + arrray[1][3]));
        System.out.println("Sum of 3rd row = " + (arrray[2][0] + arrray[2][1] + arrray[2][2] + arrray[2][3]));
        System.out.println("Sum of 4th row = " + (arrray[3][0] + arrray[3][1] + arrray[3][2] + arrray[3][3]));

        System.out.println("Sum of 1st col = " + (arrray[0][0] + arrray[1][0] + arrray[2][0] + arrray[3][0]));
        System.out.println("Sum of 2nd col = " + (arrray[0][1] + arrray[1][1] + arrray[2][1] + arrray[3][1]));
        System.out.println("Sum of 3rd col = " + (arrray[0][2] + arrray[1][2] + arrray[2][2] + arrray[3][2]));
        System.out.println("Sum of 4th col = " + (arrray[0][3] + arrray[1][3] + arrray[2][3] + arrray[3][3]));

        System.out.println("Sum of left diagonal = = " + (arrray[0][0] + arrray[1][1] + arrray[2][2] + arrray[3][3]));

        //problem 6
        int[] arr2 = new int[20];
        System.out.println("Enter 20 array elements");

        for (int i = 0; i < 20; i++) {
            System.out.print("arr2[" + i + "] = ");
            arr2[i] = input.nextInt();
        }
        int temp1;
        for (int i = 0; i < 20 - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < 20; j++) {
                if (arr2[smallest] > arr2[j]) {
                    smallest = j;
                }
            }
            temp1 = arr2[smallest];
            arr2[smallest] = arr2[i];
            arr2[i] = temp1;

        }
        double median = (arr2[9] + arr2[10]) / 2;
        System.out.println("The median is: " + median);

        //problem 7
        double[][] results = new double[4][5];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter the results for student " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Result " + (j + 1) + ": ");
                while (true) {
                    results[i][j] = input.nextDouble();
                    if (results[i][j] >= 0 && results[i][j] <= 100) {
                        break;
                    } else {
                        System.out.print("Invalid input. Please enter a number between 1 and 100: ");
                    }
                }
            }
        }
        System.out.println("Result in a tabular format: ");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", "Student", "Result 1", "Result 2", "Result 3", "Result 4", "Result 5");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Student %d: ", (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.printf("%-10.2f ", results[i][j]);
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            double average1 = 0, sum3 = 0;
            for (int j = 0; j < 5; j++) {
                sum3 = sum3 + results[i][j];
            }
            average1 = sum3 / 5;
            System.out.println("Average for student " + (i + 1) + ": " + average1);
        }
        System.out.println("");

        for (int i = 0; i < 5; i++) {
            double average1 = 0, sum3 = 0;
            for (int j = 0; j < 4; j++) {
                sum3 = sum3 + results[j][i];
            }
            average = sum3 / 4;
            System.out.println("Average for Subject " + (i + 1) + ": " + average1);
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            double max = results[0][i];
            for (int j = 1; j < 4; j++) {
                if (results[j][i] > max) {
                    max = results[j][i];
                }
            }
            System.out.println("Max for Subject " + (i + 1) + ": " + max);
        }

    }
}
