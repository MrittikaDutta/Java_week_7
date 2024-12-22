//q20


class AuthenticationFailureException extends Exception {
    public AuthenticationFailureException(String message) {
        super(message);
    }
}

public class PasswordAuthentication {
    public static void main(String[] args) {
        String correctPassword = "securePass123";
        String inputPassword = "securePass"; // password entered by the user

        try {
            if (!inputPassword.equals(correctPassword)) {
                throw new AuthenticationFailureException("Authentication Failure: Incorrect password.");
            }
            System.out.println("Password accepted. Authentication successful.");
        } catch (AuthenticationFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}
