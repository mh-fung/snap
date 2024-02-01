import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardGame {
    public List<Card> deckOfCards = new ArrayList<>();
    private String[] suits = {"Diamond","Club","Heart","Spade"};
    private String[] symbols = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    private int[] values = {2,3,4,5,6,7,8,9,10,11,12,13,14};

    public CardGame() {
        for (String suit:suits) {
            for (int i = 0; i < symbols.length; i++) {
                Card card = new Card(suit, symbols[i], values[i]);
                deckOfCards.add(card);
            }
        }
    }

    public List<Card> getDeck() {
        return deckOfCards;
    }
    public Card dealCard() {
        return deckOfCards.get(0);
    }
    public List<Card> sortDeckInNumberOrder() {
        deckOfCards.sort((a, b) -> a.getValue() - b.getValue());
        return deckOfCards;
    }
    public List<Card> sortDeckIntoSuits() {
        deckOfCards.sort((a, b) -> a.getSuit().compareTo(b.getSuit()));
        return null;
    }
    public List<Card> shuffleDeck() {
        Collections.shuffle(deckOfCards);
        return deckOfCards;
    }
}
