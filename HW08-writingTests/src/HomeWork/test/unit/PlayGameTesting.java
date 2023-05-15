package HomeWork.test.unit;

import HomeWork.Game.code.Dice;
import HomeWork.Game.code.Game;
import HomeWork.Game.code.Player;
import HomeWork.test.Spies.GameWinnerConsolePrinterSpies;
import HomeWork.test.Stubs.DiceImplStub1;
import HomeWork.test.Stubs.DiceImplStub2;

public class PlayGameTesting {

    public void moreFirst() {
        String scenario = "Васе и Игорю выпадают значения 5 и 3 соответственно: Победитель Вася";
        Dice dice = new DiceImplStub1();
        GameWinnerConsolePrinterSpies printerSpies = new GameWinnerConsolePrinterSpies();
        Game game = new Game(dice, printerSpies);
        game.playGame(new Player("Вася"), new Player("Игорь"));

        try {
            if (printerSpies.methodResult == "Вася") {
                System.out.printf("\"%s\" passed %n", scenario);
            } else {
                throw new Exception("Победил игрок с меньшим значением, что противоречит правилам игры");
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void secondMore() {
        String scenario = "Васе и Игорю выпадают значения 3 и 5 соответственно: Победитель Игорь";
        Dice dice = new DiceImplStub2();
        GameWinnerConsolePrinterSpies printerSpies = new GameWinnerConsolePrinterSpies();
        Game game = new Game(dice, printerSpies);
        game.playGame(new Player("Вася"), new Player("Игорь"));

        try {
            if (printerSpies.methodResult == "Игорь") {
                System.out.printf("\"%s\" passed %n", scenario);
            } else {
                throw new Exception("Победил игрок с меньшим значением, что противоречит правилам игры");
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void same() {
        String scenario = "Васе и Игорю выпадают одинаковые значения: Ничья";
        Dice dice = new DiceImplStub2();
        GameWinnerConsolePrinterSpies printerSpies = new GameWinnerConsolePrinterSpies();
        Game game = new Game(dice, printerSpies);
        game.playGame(new Player("Вася"), new Player("Игорь"));

        try {
            if (printerSpies.methodResult == "Ничья") {
                System.out.printf("\"%s\" passed %n", scenario);
            } else {
                throw new Exception("При равных значениях, есть победитель");
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
