package labtasktwo;

import java.util.Scanner;

public class LabTasktwo {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        //problem 2
        System.out.println("Input first name: ");
        String first = user.nextLine();
        System.out.println("Input last name: ");
        String last = user.nextLine();

        first = first.toUpperCase();
        String name = first.concat(last);
        System.out.println(name);

        //problem 3
        System.out.println("Input a string input: ");
        String input = user.nextLine();
        char lastchar = input.charAt(input.length() - 1);

        if (lastchar >= 'A' && lastchar <= 'Z' || lastchar >= 'a' && lastchar <= 'z') {
            System.out.println("It is a letter");
        } else {
            System.out.println("It is a digit");
        }

        //problem 5
        System.out.println("Input an input: ");
        String place = " Dhanmondi 28 ";
        System.out.println("Input an input: " + place);
        place = place.trim();
        System.out.println(place);

        //problem 6
        System.out.println("Print the input: ");
        String inputname = "Naziba";
        System.out.println("Input an input: " + inputname);
        char firstchar;
        firstchar = inputname.charAt(0);

        if (Character.isUpperCase(firstchar) && (firstchar == 'A' || firstchar == 'E' || firstchar == 'I' || firstchar == 'E' || firstchar == 'U')) {
            System.out.println("My name starts with a vowel");
        } else {
            System.out.println("My name starts with a consonant");
        }
        
        //netbeans cant recognize isvowel method
        
//        if (Character.isUpperCase(firstchar) && isVowel(firstchar)) {
//            System.out.println("My name starts with a vowel");
//        } else {
//            System.out.println("My name starts with a consonant");
//        }

    }
}
