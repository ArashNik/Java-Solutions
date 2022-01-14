/*
 * The problem is to randomly select a program that will randomly select four cards.
 */
package analyze;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        int deck[] = new int[52];
        String suits[] = {"Spades", "Hearts", "Diamonds","Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5" , "6", "7", "8", "9", "10",
            "Jack", "Queen", "King"};

        
        // intialize the cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        
        // shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            // generate a random index
            int j = (int)(Math.random() * deck.length);
            
            int temp = deck[i];     // shuffle the deck with random index
            deck[i] = deck[j];
            deck[j] = temp;
        }
        // display the first four cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit );
        }
    }
        
        
    }

