package OOPSinJAVA;

public class Trial {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2,3);
        Fraction f2 = new Fraction(2,3);
        Fraction f3 = Fraction.addFraction(f1, f2);
        System.out.println(f3.numerator);
        System.out.println(f3.denominator);
    }
}
