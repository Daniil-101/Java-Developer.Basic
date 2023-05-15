package HomeWork.test.unit;

import HomeWork.Game.code.Dice;
import HomeWork.Game.code.DiceImpl;

public class DiceImplTesting {
    public void valueRange() {
        Dice dice = new DiceImpl();
        String scenario = "Метод 'roll()' выдает числа 1-6";
        try {
            int x = dice.roll();
            if (x > 0 && x < 7) {
                System.out.printf("\"%s\" passed %n", scenario);
            } else {
                throw new Exception("Число выходит за диапазон 1-6");
            }
        } catch (Exception e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
