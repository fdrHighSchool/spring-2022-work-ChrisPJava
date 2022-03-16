import java.util.*;

public class Driver {
  public static void main(String[] args) {
    // create a deck for testing
    Deck deck = new Deck();
    
    ArrayList<String> p1d = new ArrayList<String>(26);
    ArrayList<String> p2d = new ArrayList<String>(26);
    
    System.out.println(deck.getLength()); // 52 cards in a standard deck
    //deck.displayDeck();

    deck.shuffleDeck();
    deck.displayDeck();
  }
}