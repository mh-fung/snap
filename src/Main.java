public class Main {
    public static void main(String[] args) {
        CardGame snap = new CardGame();
        System.out.println(snap.deckOfCards.toString());
        snap.sortDeckInNumberOrder();
        System.out.println(snap.deckOfCards.toString());
        snap.sortDeckIntoSuits();
        System.out.println(snap.deckOfCards.toString());
    }
}