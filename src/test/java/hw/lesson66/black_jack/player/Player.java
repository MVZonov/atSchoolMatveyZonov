package hw.lesson66.black_jack.player;

import hw.lesson66.black_jack.cards.Card;
import hw.lesson66.black_jack.cards.CardHand;
import java.util.Random;

    /*находится в пакете player
+    содержит внутренний параметр нервозности игрока - целое положительное число
+    содержит внутренний параметр состояния игрока PlayerState
+    содержит внутренний параметр CardHand - текущая рука, которую игрок собрал на данный момент
+    содержит внутренний параметр имя игрока

+    содержит конструктор, который принимает имя игрока в качестве параметра
+        устанавливает имя игрока
+        устанавливает параметр нервозности в 0
+        устанавливает параметр состояния игрока в ACTIVE
+        инициализирует руку игрока
    содержит внутренний метод checkState проверяет состояние игрока - продолжает он или нет
        подсчитывает число очков в руке
        если "в руке" 19, 20 или 21 очко, то состояние становится STOP, на этом проверка останавливается
        если "в руке" очков больше 10, то за каждое очко увеличивается параметр нервозности на 1
        генериться случайное целое число от 0 до 10, 10 не включая
        если случайное число меньше текущей нервозности, то состояние игрока становится STOP

    содержит общедоступный метод isActive
        возвращает true, если текущее состояние игрока ACTIVE
    содержит общедоступный метод takeCard - положить переданную карту в руку
        полученную карту добавляет в руку
        проверяет состояние игрока
    содержит общедоступный метод getPoints
        подсчитывает и возвращает кол-во очков "в руке"
    содержит общедоступный метод toString
        возвращает имя игрока*/


    public class Player {
        private String name;
        private int nervousness;
        private PlayerState state;
        private CardHand cardHand;

        public Player(String name) {
            this.name = name;
            nervousness = 0;
            state = PlayerState.ACTIVE;
            cardHand = new CardHand();
        }

        private void checkState() {
            int points = getPoints();
            if (points>21){
                state = PlayerState.STOP;
            }
            if (points >= 19 && points <= 21) {
                state = PlayerState.STOP;
                return;
            }

            if (points > 10) {
                nervousness += 1;
            }

            Random random = new Random();
            int randomNum = random.nextInt(10);
            if (randomNum < nervousness) {
                state = PlayerState.STOP;
            }
        }

        public boolean isActive() {
            return state == PlayerState.ACTIVE;
        }

        public void takeCard(Card card) {
            cardHand.addCard(card);
            checkState();
        }

        public int getPoints() {
            return cardHand.getPoints();
        }

        @Override
        public String toString() {
            return name;
        }
    }

