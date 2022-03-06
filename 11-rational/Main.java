public class Main {
  public static void main(String[] args) {
    // Objects
    Rational rational = new Rational();
    Rational rational1 = new Rational(33, 22);
    Rational simpTest = new Rational(50,200);
    Rational frac1 = new Rational(1,2);
    Rational frac2 = new Rational(2,5);

    // Tests
    rational1.printRational();
    rational.printRational();
    rational1.toString();
    rational1.negate();
    rational1.invert();
    System.out.println(rational1.toDouble());
    simpTest.reduce();
    System.out.println(frac1.add("2/5"));
  }
}