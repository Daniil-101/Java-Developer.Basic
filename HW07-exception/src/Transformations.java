import java.io.StreamCorruptedException;


public class Transformations {
    private static final int ERROR_VALUE_GREATER_THAN_100 = 101;

    public static int stringOfNumber(String str) { // возврат значения по умолчанию
        int x;
        try {
            x = Integer.parseInt(str);
            return x;
        } catch (NumberFormatException e) {
            x = 0;
        }
        return x;
    }

    public static String numberOfString(int number) { //возврат кода ошибки
        String str = "";
        try {
            if (number == 0) {
                throw new NullPointerException();
            } else if (number > 100) {
                throw new IllegalArgumentException();
            }
        } catch (NullPointerException e) {
            str = "Пришел 0";
        } catch (IllegalArgumentException e) {
            str = "Error: " + String.valueOf(ERROR_VALUE_GREATER_THAN_100);
        }
        return str;
    }

    public static void error(int number) throws NullPointerException, IllegalArgumentException { // это мне нужно было
        // для этого (NullPointerException | IllegalArgumentException e)
        if (number >= 0) {
            throw new NullPointerException("oops");
        } else {
            throw new IllegalArgumentException("lol");
        }
    }

    public static void Exception1() throws StreamCorruptedException { // отлов ошибки и проброс (в Exception1_1)
        throw new StreamCorruptedException();
    }

    public static int convertStringToInt(String s) {
        int x = Integer.parseInt(s);
        return x;
    }

}
