//q3

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class NoMatchDemo {
    public static void main(String[] args) {
        String input = "College";
        try {
            if (!input.equals("University")) {
                throw new NoMatchFoundException("No Match Found: Input is not 'University'");
            } else {
                System.out.println("Match Found: " + input);
            }
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
