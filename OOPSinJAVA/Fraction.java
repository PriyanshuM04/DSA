package OOPSinJAVA;

public class Fraction {
    public int numerator;
    public int denominator;
//    public Fraction(){}    // Default constructor
    public Fraction(int num, int den){
        this.numerator = num;
        this.denominator = den;
    }

    public static Fraction addFraction(Fraction f1, Fraction f2){
        int n1 = f1.numerator;
        int d1 = f1.denominator;
        int n2 = f2.numerator;
        int d2 = f2.denominator;

        int dResult = d1 * d2;
        int coefficient1 = (int)(dResult/d1);
        int coefficient2 = (int)(dResult/d2);
        int nResult = (n1 * coefficient1) + (n2 * coefficient2);

        Fraction result = new Fraction(nResult, dResult);
        return result;
    }
    public static Fraction subtractFraction(Fraction f1, Fraction f2){
        int n1 = f1.numerator;
        int d1 = f1.denominator;
        int n2 = f2.numerator;
        int d2 = f2.denominator;

        int dResult = d1 * d2;
        int coefficient1 = (int)(dResult/d1);
        int coefficient2 = (int)(dResult/d2);
        int nResult = (n1 * coefficient1) - (n2 * coefficient2);

        Fraction result = new Fraction(nResult, dResult);
        return result;
    }
    public static Fraction multiplyFraction(Fraction f1, Fraction f2){
        int n1 = f1.numerator;
        int d1 = f1.denominator;
        int n2 = f2.numerator;
        int d2 = f2.denominator;

        int dResult = d1 * d2;
        int nResult = n1 * n2;

        Fraction result = new Fraction(nResult, dResult);
        return result;
    }
}
