package fraction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fraction number1 = new Fraction(1, 4);
        Fraction number2 = new Fraction(6, 5);

        System.out.println(number1.getDenominator());
        System.out.println(number1.getNumerator());
        
        //changing number 1 numerator denominator
        System.out.println(number1.toString());
        number1.setDenominator(3);
        number1.setNumerator(2);
        System.out.println(number1.toString());
        
        number1.add(number2);
        number1.sub(number2);
        number1.multiplication(number2);
        number1.division(number2);
        
        
    }

}
