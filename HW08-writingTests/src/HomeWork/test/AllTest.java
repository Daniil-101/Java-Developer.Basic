package HomeWork.test;

import HomeWork.test.unit.DiceImplTesting;
import HomeWork.test.unit.PlayGameTesting;

public class AllTest {
    /*
        Заготовка для ДЗ представляет собой игру в кости.
        При вызове game.playGame(), два игрока кидают кости.
        Выигрывает игрок, у кого результат (1-6) больше
        Написать тесты (минимум 4) на классы DiceImpl и HomeWork.Game.
        Тесты должны найти не менее двух ошибок.
        Информацию о пройденном тесте предлагается выводить в System.out, а об упавшем в System.err
     */
    public static void main(String[] args) {
        new DiceImplTesting().valueRange();

        new PlayGameTesting().moreFirst();
        new PlayGameTesting().secondMore();
        new PlayGameTesting().same();
    }
}
