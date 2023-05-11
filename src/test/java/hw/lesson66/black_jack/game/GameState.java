package hw.lesson66.black_jack.game;

public enum GameState {
    STOP, //игра остановлена, но не завершена. Начальное состояние игры
    RUNNING, //игра продолжается
    WIN, //игра закончилась победой одного из игроков
    DRAW //игра закончилась ничьей
}
