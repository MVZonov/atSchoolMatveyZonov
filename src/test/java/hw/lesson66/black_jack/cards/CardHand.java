package hw.lesson66.black_jack.cards;

import java.util.ArrayList;
import java.util.List;

public class CardHand {
    /*содержит внутренний массив карт Card - текущее состояние руки
    содержит общедоступный конструктор без параметров
        инициализирует внутренний массив
    содержит общедоступный метод addCard
        добавляет карту "в руку"
    содержит общедоступный метод getPoints
        возвращает количество очков "в руке"*/
    private List<Card> hand;

    public CardHand() {
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int getPoints() {
        int points = 0;
        for (int i = 0; i < hand.size(); i++) {
            points += hand.get(i).getPoints();
        }
        return points;
    }
}

