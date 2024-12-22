//q12
class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

public class TemperatureCheck {
    public static void main(String[] args) {
        try {
            int temperature = Integer.parseInt(args[0]);
            if (temperature > 35) {
                throw new TooHotException("Temperature is too hot.");
            } else if (temperature < 5) {
                throw new TooColdException("Temperature is too cold.");
            } else {
                System.out.println("Temperature is Normal.");
                double fahrenheit = temperature * 9 / 5.0 + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
            }
        } catch (TooHotException | TooColdException e) {
            System.out.println(e.getMessage());
        }
    }
}
