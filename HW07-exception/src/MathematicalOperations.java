import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.StreamCorruptedException;

public class MathematicalOperations {
    public static int factorial(int number) { //игнорирование, подавление
        int factorialNumber = 1;
        for (int i = 1; i <= number; i++) {
            try {
                if ((factorialNumber *= i) < 0) {
                    throw new InterruptedIOException();
                }
            } catch (InterruptedIOException e) {

            }
        }
        return factorialNumber;
    }

    public static void SquareRootOfANumber(int number) throws FileNotFoundException { //отказ от ответственности
        if (number < 0) {
            try {
                throw new Exception();
            } catch (Exception e) {
                throw new FileNotFoundException("На вход пришло отрицательное число");
            }
        } else {
            System.out.println(Math.sqrt((double) number));
        }
    }

    public static void Exception1_1() throws StreamCorruptedException { //проброс той же ошибки что была отловлена
        Transformations.Exception1();
    }
}
