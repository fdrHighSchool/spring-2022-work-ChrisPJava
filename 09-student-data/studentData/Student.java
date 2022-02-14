public class Student {
    // Field, the instance variables (data)
    private String id;
    private String name;
    private boolean cc;
    private int[] grades;
    
    // constuctor method
  public Student(String id, String n, boolean cc, int[] g) {
    this.id = id;
    this.name = n;
    this.cc = cc;
    this.grades = g;
  }

  // behaviors (methods)

  // get the close contact status of the student
  public boolean getCloseContact() {
    return this.cc;
  } // end isCloseContact method

  // set the value of close contact
  public void setCloseContact(boolean value) {
    if(value) {
        System.out.println(this.name + " is a close contact.");
    }
  }

  // see if the student is failing
  public boolean isFailing(int[] grd) {
    if(getAverage() < 65) {
        return true;
    }
    return false;
  }

  // get object's name value
  public String getName() {
    return this.name;
  }

  public double getAverage() {
    int total = 0;

    for (int grade : this.grades) {
      total += grade;
    } // end for-each loop
    return total / grades.length;
  } // end getAverage method
} //end class
