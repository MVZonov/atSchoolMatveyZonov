package hw.lesson66.black_jack.cards;

public class Card {
    private CardType type;
    private CardSuit suit;

    public Card(CardSuit suit, CardType type) {
        this.suit = suit;
        this.type = type;
    }

    public void setCardType(CardType type) {
        this.type = type;
    }

    public void setCardSuit(CardSuit suit) {
        this.suit = suit;
    }

    public int getPoints() {
        switch (type) {
            case ACE:
                return CardType.ACE.getPoints();
            case KING:
                return CardType.KING.getPoints();
            case QUEEN:
                return CardType.QUEEN.getPoints();
            case JACK:
                return CardType.JACK.getPoints();
            case TEN:
                return CardType.TEN.getPoints();
            case NINE:
                return CardType.NINE.getPoints();
            case EIGHT:
                return CardType.EIGHT.getPoints();
            case SEVEN:
                return CardType.SEVEN.getPoints();
            case SIX:
                return CardType.SIX.getPoints();
            case FIVE:
                return CardType.FIVE.getPoints();
            case FOUR:
                return CardType.FOUR.getPoints();
            case THREE:
                return CardType.THREE.getPoints();
            case TWO:
                return CardType.TWO.getPoints();
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return type + " of " + suit;
    }
}