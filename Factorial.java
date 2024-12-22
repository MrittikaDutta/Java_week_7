//q5
public class Factorial {
    private static long[] factorials = new long[21];  // Array to store factorials up to 20!

    public static long factorial(int x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("Value of x must be positive");
        }
        if (x > 20) {
            throw new IllegalArgumentException("Result will overflow");
        }
        if (factorials[x] != 0) return factorials[x];

        long result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        factorials[x] = result;
        return result;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Factorial of 5: " + factorial(5));
            System.out.println("Factorial of 21: " + factorial(21)); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
