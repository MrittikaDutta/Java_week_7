//q19

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class UserValidation {
    public static void main(String[] args) {
        String username = "user"; // input username
        String password = "pass123"; // input password
        String correctPassword = "pass123";

        try {
            if (username.length() < 6) {
                throw new InvalidUsernameException("Username must be at least 6 characters long.");
            }
            if (!password.equals(correctPassword)) {
                throw new PasswordMismatchException("Password does not match.");
            }
            System.out.println("Username and password are valid.");
        } catch (InvalidUsernameException | PasswordMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}

