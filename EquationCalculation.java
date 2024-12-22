//q11
class ArithmeticExceptionOne extends Exception {
    public ArithmeticExceptionOne(String message) {
        super(message);
    }
}

class ArithmeticExceptionTwo extends Exception {
    public ArithmeticExceptionTwo(String message) {
        super(message);
    }
}

public class EquationCalculation {
    public static void main(String[] args) {
        try {
            int X = 10, Y = 5, P = 0, Q = 0, Z = 1, I = 2;
            if (Q == 0) throw new ArithmeticExceptionOne("Division by zero (P/Q)");
            if (Z == 0) throw new ArithmeticExceptionTwo("Power of zero");

            int result = X + Y * (P / Q) * Z - I;
            System.out.println("Result: " + result);
        } catch (ArithmeticExceptionOne | ArithmeticExceptionTwo e) {
            System.out.println(e.getMessage());
        }
    }
}
