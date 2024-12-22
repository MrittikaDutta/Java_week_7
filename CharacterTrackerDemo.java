//q4

class CharacterTracker {
    private int totalChars = 0;

    public void addCharacter(char ch) throws IllegalArgumentException {
        if (!Character.isAlphabetic(ch)) {
            throw new IllegalArgumentException("Non-alphabetic character passed: " + ch);
        }
        totalChars++;
    }

    public int getTotalChars() {
        return totalChars;
    }
}

public class CharacterTrackerDemo {
    public static void main(String[] args) {
        CharacterTracker tracker = new CharacterTracker();
        try {
            tracker.addCharacter('a');
            tracker.addCharacter('1'); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total alphabetic characters: " + tracker.getTotalChars());
    }
}
