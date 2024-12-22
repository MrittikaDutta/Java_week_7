//q18

class NotCorrectException extends Exception {
    public NotCorrectException(String message) {
        super(message);
    }
}

public class QuizManagement {
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        String[] userAnswers = {"A", "B", "C", "E", "A"};

        try {
            for (int i = 0; i < correctAnswers.length; i++) {
                if (!correctAnswers[i].equals(userAnswers[i])) {
                    throw new NotCorrectException("Question " + (i + 1) + " is incorrect.");
                }
                System.out.println("Question " + (i + 1) + ": good! The answer is correct.");
            }
        } catch (NotCorrectException e) {
            System.out.println(e.getMessage());
        }
    }
}
