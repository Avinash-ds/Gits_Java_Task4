package collectionmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffling {
    public static void main(String[] args) {
        List<Integer> deck = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            deck.add(i);
        }

        // Shuffle the deck
        Collections.shuffle(deck);
        System.out.println("Shuffled Deck: " + deck);
    }
}
