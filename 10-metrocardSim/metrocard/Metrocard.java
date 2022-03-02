public class Metrocard {
    // Instance variables; Time of swipe, Is the swipe/card valid.
    private int time; // XX:XX
    private boolean valid; // TRUE:FALSE
    private int swipes; // 3-0

    // Constructor
    public Metrocard(int t, int s) {
        this.swipes = s;
        this.time = t;
        this.valid = validCard();
    }// end Constructor method

    public boolean getValidCard() {
        return this.valid;
    }// end getValidCard method

    public int getSwipes() {
        return this.swipes;
    }// end getSwipes method

    public boolean validCard() {
        if((this.time < 2031 && this.time > 529) && swipes > 0) {
            return true;
        }
        return false;
    }// end validCard method

    public void swipe() {
        if(this.valid) {
            System.out.println("Pass through, swipes left: "+ this.swipes);
        }
        else {
            System.out.println("Swipes left: "+ this.swipes +". Time is "+ this.time);
        }
    } // end Swipe method
} // end class swipes
