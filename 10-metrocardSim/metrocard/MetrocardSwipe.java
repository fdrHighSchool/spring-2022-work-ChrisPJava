public class MetrocardSwipe {
    public static void main(String[] args) {
        /*
            Simulation goes as follows: Swipe at 7:00 AM, 3:00 PM, and 9:00 PM.
            One object is used, one Metrocard card, for the whole Simulation.
            The card will go through all 3 swipes and one that with 0 swipes.
            A card will carry the time of the swipe and how many swipes are left.
            This is a simulation of a person's metrocard.
        */

        // SIMULATION OF ONE DAY

        // Instance Metrocard class
        Metrocard card = new Metrocard(700, 3); // Swipe at 7:00 AM

        card.swipe();
        System.out.println("Is your card valid: "+ card.validCard());
        System.out.println(card.getValidCard());
        System.out.println(card.getSwipes());


        card = new Metrocard(1500, 2); // Swipe at 3:00 PM

        card.swipe();
        System.out.println("Is your card valid: "+ card.validCard());
        System.out.println(card.getValidCard());
        System.out.println(card.getSwipes());

        card = new Metrocard(2000, 1); // Swipe at 8:00 PM

        card.swipe();
        System.out.println("Is your card valid: "+ card.validCard());
        System.out.println(card.getValidCard());
        System.out.println(card.getSwipes());

        card = new Metrocard(2105, 0); // Swipe at 9:05 PM

        card.swipe();
        System.out.println("Is your card valid: "+ card.validCard());
        System.out.println(card.getValidCard());
        System.out.println(card.getSwipes());
    } // end main method
} // end class
