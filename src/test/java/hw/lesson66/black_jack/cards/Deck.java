package hw.lesson66.black_jack.cards;

import java.util.Random;

public class Deck {
    /*
+    содержит внутренний массив карт Card - внутреннее представление колоды
    конструктор без параметров
        генерируется число от 1 до 8 - число стандартных колод из 52 карт, которые буду замешиваться в общую
        (стандартная колода из 52х карт содержит 13 типов карт по 4 масти)
        создается общая колода
        перетасовывается колода
    внутренний метод shuffle
        случайным образом меняет порядок карт
    общедоступный метод getTopCard
        перемешивает колоду
        возращает карту с верха колоды (с нулевым индексом)*/
    private Card[] cards;

    public Deck() {
        Random random = new Random();
        int numDecks = random.nextInt(8) + 1;
        int numCards = numDecks * 52;
        cards = new Card[numCards];

        int index = 0;
        for (int i = 0; i < numDecks; i++) {
            for (CardSuit suit : CardSuit.values()) {
                for (CardType rank : CardType.values()) {
                    cards[index] = new Card(suit, rank);
                    index++;
                }
            }
        }
        shuffle();
    }

    private void shuffle() {
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card getTopCard() {
        shuffle();
        return cards[0];
    }
}