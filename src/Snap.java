import java.util.Scanner;

public class Snap extends CardGame{
    Scanner scanner = new Scanner(System.in);
    public void playGame() {
        System.out.println("HOLA!");
        this.shuffleDeck();
        while (deckOfCards.size() >=2) {
            System.out.println("Press ENTER to draw a card");
            scanner.nextLine();
            Card card1 = this.dealCard();
            System.out.println("You first card is..." + card1);
            scanner.nextLine();
            Card card2 = this.dealCard();
            System.out.println("You second card is..." + card2);
            if (card2.getSymbol().equals(card1.getSymbol())) {
                System.out.println("SNAP!");
                break;
            } else {
                System.out.println("Sorry, let's try again!");
            }
        }
    }
}
