package labtask2;

import java.util.Scanner;

public class LabTask1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //problem 1
        
        double February = input.nextDouble();
        System.out.println("The salary of February: "+February);
        double March = input.nextDouble();
        System.out.println("The salary of March: "+March);
        double April = input.nextDouble();
        System.out.println("The salary of April: "+April);

        double max = February;
        if (March > max) {
            max = March;
        }
        if (April > max) {
            max = April;
        }

        max = (int) max;

        double min;
        if (February < March && February < April) {
            min = February;
        } else if (March < February && March < April) {
            min = March;
        } else {
            min = April;
        }

        double value = (min / 2) + max;
        System.out.println(value);

        //problem 4
        System.out.print("Take an amount of points from user: ");
        int point = input.nextInt();
        double finalvalue = Math.sqrt(point);

        System.out.println("The final value is " + finalvalue);

        //problem 7
        System.out.print("Take an input from user: ");
        int integer = input.nextInt();

        switch (integer % 2) {
            case 0:
                System.out.println("Its an even number");
                break;

            case 1:
                System.out.println("Its an odd number");
                break;
        }

        //problem 8
        System.out.println("one: ");
        int one = input.nextInt();
        System.out.println("two: ");
        int two = input.nextInt();
        System.out.println("Three: ");
        int three = input.nextInt();

       
        System.out.println("Press a number for action: ");
        int press = input.nextInt();
        
        int maximum = one;
        if (two > max) {
            maximum = two;
        }
        if (three > max) {
            maximum = three;
        }

        switch (press) {
           
            case 1: {
                int sum = one+two+three;
                System.out.println("the addition is: " +sum);
            }
            case 2:{
                int minus;
                if(max==one){
                    minus = one-two-three;
                }
                else if(max==two){
                    minus = two-one-three;
                }
                else{
                    minus = three-one-two;
                }
                System.out.println("the addition is: " +minus);
            }
            case 3:{
                int multi = one * two * three ;
                System.out.println("the multiplication is: " +multi);
            }
            default: System.out.println("Default Input");
            
            
        }

    }
}
