//q14

class WrongNumberFormatException extends Exception {
    public WrongNumberFormatException(String message) {
        super(message);
    }
}

public class BinaryToDecimal {
    public static void main(String[] args) {
        try {
            String binary = args[0];
            if (!binary.matches("[01]+")) {
                throw new WrongNumberFormatException("Invalid binary number format.");
            }
            int decimal = Integer.parseInt(binary, 2);
            System.out.println("Decimal value: " + decimal);
        } catch (WrongNumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
