public class Test {
    private String question;
    private String answer;

    public String getQuestion() {
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public boolean checkAnswer(String answer) {
        if (answer == this.answer) {
            return true;
        }
        return false;
    }
}
