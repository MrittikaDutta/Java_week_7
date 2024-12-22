
//q22

class NotPositiveException extends Exception {
    public NotPositiveException(String message) {
        super(message);
    }
}

public class PositiveNumberCheck {
    public static void main(String[] args) {
        int number = -5; // input number

        try {
            if (number <= 0) {
                throw new NotPositiveException("Number must be positive.");
            }
            System.out.println("Number is positive: " + number);
        } catch (NotPositiveException e) {
            System.out.println(e.getMessage());
        }
    }
}
