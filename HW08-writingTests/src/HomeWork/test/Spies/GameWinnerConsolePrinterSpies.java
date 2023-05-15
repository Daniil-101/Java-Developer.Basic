package HomeWork.test.Spies;

import HomeWork.Game.code.GameWinnerConsolePrinter;
import HomeWork.Game.code.Player;

public class GameWinnerConsolePrinterSpies extends GameWinnerConsolePrinter {
    public String methodResult;

    @Override
    public void printWinner(Player winner) {
        methodResult = winner.getName();
    }
}
