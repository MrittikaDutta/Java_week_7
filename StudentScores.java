//q25

class ScoreException extends Exception {
    public ScoreException(String message) {
        super(message);
    }
}

public class StudentScores {
    public static void main(String[] args) {
        int[] studentIDs = {101, 102, 103, 104, 105};
        int[] scores = new int[5];

        for (int i = 0; i < studentIDs.length; i++) {
            try {
                System.out.println("Enter score for student ID " + studentIDs[i] + ":");
                int score = Integer.parseInt(args[i]); // taking input from command line
                if (score < 0 || score > 100) {
                    throw new ScoreException("Invalid score! Score must be between 0 and 100.");
                }
                scores[i] = score;
            } catch (ScoreException e) {
                System.out.println(e.getMessage());
                scores[i] = 0; // assign 0 if exception occurs
            }
        }

        System.out.println("\nFinal Scores:");
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.println("Student ID: " + studentIDs[i] + ", Score: " + scores[i]);
        }
    }
}
