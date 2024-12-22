class TooOlderException extends Exception {
    public TooOlderException(String message) {
        super(message);
    }
}

class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
        super(message);
    }
}

public class EmployeeRecruitment {
    public static void main(String[] args) {
        try {
            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age > 45) {
                throw new TooOlderException("Age is too old for recruitment.");
            } else if (age < 20) {
                throw new TooYoungerException("Age is too young for recruitment.");
            } else {
                System.out.println("Candidate is eligible. Name: " + name);
            }
        } catch (TooOlderException | TooYoungerException e) {
            System.out.println(e.getMessage());
        }
    }
}
