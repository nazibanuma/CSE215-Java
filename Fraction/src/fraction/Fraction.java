package fraction;

public class Fraction {

    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        String str = numerator + "/" + denominator;
        return str;
    }

    public void add(Fraction vag) {
        double addition = (double)(numerator*vag.getDenominator()+vag.getNumerator()*denominator)/(denominator*vag.getDenominator());
         System.out.println("the addition is : " +addition);
    }

    public void sub(Fraction vag) {
        double minus =(double)(numerator*vag.getDenominator()-vag.getNumerator()*denominator)/(denominator*vag.getDenominator());
         System.out.println("the subtraction is : " +minus);
    }

    public void multiplication(Fraction goon) {
        double multi = (((double)numerator*goon.getNumerator())/(denominator*goon.getDenominator()));
        System.out.println("the multiplication is: "+multi);
    }

    public void division(Fraction vag) {
        double divide = (((double)numerator*vag.getDenominator())/(vag.getNumerator()* denominator));
        System.out.println("the division is: "+divide);
    }
}
