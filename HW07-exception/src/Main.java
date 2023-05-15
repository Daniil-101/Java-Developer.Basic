import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            int factor = MathematicalOperations.factorial(17);
            MathematicalOperations.SquareRootOfANumber(factor);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());  //вывод ошибки
        } finally {
            System.out.println(Transformations.stringOfNumber("6845sdfv"));
            System.out.println(Transformations.numberOfString(0));
            System.out.println(Transformations.numberOfString(123));
            try (FileWriter writer = new FileWriter("Clients.txt", true)) {
                try {
                    int randomNumber = (int) (Math.random() * (2 + 1)) - 1;
                    Transformations.error(randomNumber);
                } catch (NullPointerException | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    throw new IOException();
                }
            } catch (IOException e) {
                System.out.println(Transformations.convertStringToInt(null));
            } finally {
                try {
                    WrappingACaughtErrorIntoANewOne.wrappingTheErrorInANewOne();
                } catch (MyException e) {
                    System.out.println(e);
                }
            }
        }
    }
}