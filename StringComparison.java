//q23

class StringMismatchException extends Exception {
    public StringMismatchException(String message) {
        super(message);
    }
}

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        try {
            if (!str1.equalsIgnoreCase(str2)) {
                throw new StringMismatchException("Strings do not match (ignoring case).");
            }
            System.out.println("Strings match.");
        } catch (StringMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
