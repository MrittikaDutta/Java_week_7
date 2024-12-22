//q6
class RunningTotal {
    private int total = 0;

    public void addCharacter(char ch) throws IllegalArgumentException {
        if (!Character.isAlphabetic(ch)) {
            throw new IllegalArgumentException("Non-alphabetic character passed: " + ch);
        }
        total++;
    }

    public int getTotal() {
        return total;
    }
}

public class RunningTotalDemo {
    public static void main(String[] args) {
        RunningTotal tracker = new RunningTotal();
        try {
            tracker.addCharacter('b');
            tracker.addCharacter('9');  // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total alphabetic characters: " + tracker.getTotal());
    }
}
