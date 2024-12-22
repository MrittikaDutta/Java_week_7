//q9

class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class ArgumentCheck {
    public static void main(String[] args) {
        try {
            if (args.length < 5) {
                throw new CheckArgumentException("Less than 5 arguments provided.");
            }
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += Integer.parseInt(args[i]);
            }
            System.out.println("Sum of the five numbers: " + sum);
        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
