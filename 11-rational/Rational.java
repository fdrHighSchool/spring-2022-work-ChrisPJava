public class Rational {
  // Fields
  private int num;
  private int denom;

  // Constructor
  public Rational() {
    this.num = 0;
    this.denom = 1;
  }

  // Overloaded constructor with num and denom parameters
  public Rational(int num, int denom) {
    this.num = num;
    this.denom = denom;
  }

  
  // Method that prints out the num/denom
  public void printRational() {
    System.out.println(this.num + "/" + this.denom);
  } 

  // Method the prints the string version
  public String toString() {
    return this.num +"/"+ this.denom;
  }

  // Negates the rational
  public void negate() {
    System.out.println((this.num / this.denom) * -1);
  }

  // Inverts the rational
  public void invert() {
    System.out.println(this.denom +"/"+ this.num);
  }
  
  // Double type the rational
  public double toDouble() {
   return ((double)(this.num)) / ((this.denom)); 
  }

  // Euclidean Algorithm the rational
  public void reduce() {
    for(int i=this.denom; i>1; i--) {
      if((this.denom % i == 0) && (this.num % i ==0)) {
        System.out.println(this.num / i + "/" + this.denom /i);
        i = -1;
      }
    }
  }

  // Adds the rationals
  public String add(String f2) {
    int fracIndex = f2.indexOf("/");
    System.out.println(fracIndex);
    System.out.println(this.num);
    System.out.println(this.denom);
    return f2;
  }
}
