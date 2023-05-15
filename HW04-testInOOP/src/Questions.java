import java.util.Scanner;

public class Questions {
    private String question;

    private String[] answers;

    private int correctAnswerNumber;

    public Questions(String question, String[] answers, int correctAnswerNumber) {
        this.question = question;
        this.answers = answers;
        this.correctAnswerNumber = correctAnswerNumber;
    }

    public void setQuestions(String question){
        this.question = question;
    }

    public String getQuestion(){
        return question;
    }

    public void setAnswers(String[] answers){
        this.answers = answers;
    }

    public String[] getAnswers(){
        return answers;
    }

    public void setCorrectAnswerNumber(int correctAnswerNumber){
        this.correctAnswerNumber = correctAnswerNumber;
    }

    public int getCorrectAnswerNumber(){
        return correctAnswerNumber;
    }

    public boolean ask() {
        System.out.println(question);
        for (int i = 0; i < answers.length; i++) {
            System.out.println((i + 1)+ ". " + answers[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Ваш ответ: ");
        int userResponse = sc.nextInt();
        boolean result;
        if (userResponse == correctAnswerNumber) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
