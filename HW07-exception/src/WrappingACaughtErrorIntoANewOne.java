import java.io.StreamCorruptedException;

public class WrappingACaughtErrorIntoANewOne {

    public static void wrappingTheErrorInANewOne() throws MyException { //оборачивание пойманной ошибки в новую и дальнейший
        // проброс в верх по иерархии
        try {
            MathematicalOperations.Exception1_1();
        } catch (StreamCorruptedException e) {
            throw new MyException("Что-то пошло не так.");
        }
    }
}
