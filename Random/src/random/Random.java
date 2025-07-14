package random;

import java.util.Scanner;

public class Random {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        
        for (int i = 1; i <= 3; i++) {
            char input1 = (char)(('a' + Math.random() * 26)) ;

            System.out.println("Give me an number between a to z : " + input1);
            //sum = sum + input1;
         
        }
        System.out.println("Sum is : "+ sum);

//      String str = input.nextLine();
//        boolean ch = str.startsWith("N");
//
//        System.out.println("The charcter starts with Num: " + ch);
        //char firstword = str.charAt(0);
//        char c = 'g';
//        System.out.println("The first word is indeed cap : " + Character.isUpperCase(c));
//
//        if(str.equals(str.toUpperCase())){
//            System.out.println("Its in upper case");
//        }
//        else{
//            System.out.println("ITs not in uppercase");
//        }
    

    }

}
