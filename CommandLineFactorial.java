//q8

public class CommandLineFactorial {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("No argument provided.");
            }

            int x = Integer.parseInt(args[0]);

            if (x == 0) {
                throw new IllegalArgumentException("Value cannot be zero.");
            }

            long result = 1;
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
            System.out.println("Factorial of " + x + " is: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please provide an integer value.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
