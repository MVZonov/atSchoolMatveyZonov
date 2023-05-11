package hw.lesson66.black_jack.game;

import hw.lesson66.black_jack.cards.Card;
import hw.lesson66.black_jack.cards.Deck;
import hw.lesson66.black_jack.player.Player;
    /* находится в пакете game
    содержит внутреннее поле типа Deck - текущую игровую колоду
    содержит внутреннее поле типа Player - обозначает победиля игры
    содержит внутреннее поле типа GameState - текущее состояние игры

    содержит внутренний конструктор - устанавливает начальное состояние игры STOP
    содержит внутренний метод isRunning - возвращает true, если состояние игры RUNNING
    содержит внутренний метод start
        переводит игру в состояние RUNNING
        создает стартовую колоду
    содержит внутренний метод checkState
        по информации от двух игроков
        проверяет условия завершения игры, согласно описанию выше.
        Если устанавливается победа, то в поле победителя указывается соответствующий объект
            устанавливает состояние игры WIN
        Если устанавливается ничья, то устанавливает состояние игры DRAW
    содержит внутренний метод getTopCard
        достает из текущей колоды карту и возвращает ее
    содержит внутренний метод takeTurn - совершает ход для указанного игрока
        игроку дают карту из колоды
        если игрок активен, то он берет карту
        выводят какую карту дали игроку

    содержит метод с доступом из пакета printResult
        выводит сообщение о результате игры в соответствии с ее состоянием

    метод main
        создается новая игра
        создаются два игрока
        стартует новая игра
        повторяем пока игра продолжается
            по-очереди делаются ходы для каждого игрока
            проверяется завершена ли игра
        если игра завершена, то вывести информацию об игре*/


public class Game {
    private Deck deck;
    private Player winner;
    private GameState state;

    private Game() {
        this.state = GameState.STOP;
    }

    private boolean isRunning() {
        return state == GameState.RUNNING;
    }

    private void start() {
        this.deck = new Deck();
        this.state = GameState.RUNNING;
    }

    private void checkState(Player player1, Player player2) {
        int player1Points = player1.getPoints();
        int player2Points = player2.getPoints();
        if (!player1.isActive() && !player2.isActive()) {
            if (player1Points > player2Points && player1Points <=21 || player2Points > 21 && player1Points <= 21) {
                this.winner = player1;
                this.state = GameState.WIN;
            } else if (player1Points < player2Points && player2Points <=21 || player1Points > 21 && player2Points <= 21) {
                this.winner = player2;
                this.state = GameState.WIN;
            } else {
                this.state = GameState.DRAW;
            }
        }
    }

    private Card getTopCard() {
        return deck.getTopCard();
    }

    private void takeTurn(Player player) {
        Card card = getTopCard();
        player.takeCard(card);
        System.out.println(player + " took " + card.toString());
    }

    void printResult() {
        switch (state) {
            case WIN:
                System.out.println("The winner is " + winner);
                break;
            case DRAW:
                System.out.println("The game ended in a draw");
                break;
            default:
                System.out.println("The game is still in progress");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        game.start();

        while (game.isRunning()) {
            if (player1.isActive()) {
                game.takeTurn(player1);
            }
            if (player2.isActive()) {
                game.takeTurn(player2);
            }
            game.checkState(player1, player2);
        }
        game.printResult();
    }
}

