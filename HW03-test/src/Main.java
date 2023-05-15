import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Тест по Java.");
        System.out.println("В тесте всего 3 вопроса, для прохождения данного теста нужно правильно ответить на 2.");

        String[] questions = {"Начнём с простого: что такое Java?",
                "Что из следующего является диапазоном char в Java?",
                "Какие из этих операторов можно использовать для объединения двух или более объектов String?"};

        String[][] answers = {{"1. Мотоцикл", "2. Чай", "3. Язык программирования", "4. Остров"},
                {"1. От -128 до 127", "2. От 0 до 256", "3. От 0 до 65535"},
                {"1. +", "2. *=", "3. +=", "4. &&", "5. ||"}};

        double[] correctAnswersIndexes = {3.0, 3.0, 1.0};

        int counter = 0;

        for (int i = 0; i < answers.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answers[i].length; j++) {
                System.out.println(answers[i][j]);
            }

            if (!sc.hasNextDouble()) {
                System.out.println("Некорректный ввод. Перезапустите программу и попробуйте снова!");
            } else {
                double answerUser = sc.nextDouble();
                while (true) {
                    if (answerUser < 1.0 || answerUser > answers[i].length) {
                        System.out.println("Нет ответа с таким номером. Попробуй еще раз.");
                        answerUser = sc.nextDouble();
                    }else break;
                }
                if (answerUser == correctAnswersIndexes[i]) {
                    System.out.println("Верно");
                    counter++;
                } else System.out.println("Неверно");
            }
        }
        System.out.println("Вы ответили верно на " + counter);
        System.out.println(counter >= 2 ? "Вы молодец! Тест пройден." : "Ничего страшного, попробуй еще раз.");
    }
}