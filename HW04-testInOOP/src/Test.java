public class Test {

    public static void main(String[] args) {

        Questions question1 = new Questions("Начнём с простого: что такое Java?",
                new String[]{"Мотоцикл", "Чай", "Язык программирования", "Остров"},
                3);
        Questions question2 = new Questions("Что из следующего является диапазоном char в Java?",
                new String[]{"1. От -128 до 127", "2. От 0 до 256", "3. От 0 до 65535"},
                3);
        Questions question3 = new Questions("Какие из этих операторов можно использовать для объединения " +
                "двух или более объектов String?", new String[]{"1. +", "2. *=", "3. +=", "4. &&", "5. ||"},
                1);

        Questions[] questions = {question1, question2, question3};


        int count = 0;
        for(Questions question: questions){
            if (question.ask() == true){
                System.out.println("Верно." + "\n");
                count++;
            }else{
                System.out.println("Неверно." + "\n");
            }
        }
        System.out.println("Вы ответили верно на " + count + " вопросов.");
        System.out.println(count >= 2 ? "Вы молодец! Тест пройден." : "Попробуйте еще раз.");
    }
}
