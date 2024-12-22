//q7

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CapitalFinder {
    public static String findCapital(String country) throws NoMatchFoundException {
        switch (country) {
            case "India": return "New Delhi";
            case "USA": return "Washington D.C.";
            case "UK": return "London";
            default: throw new NoMatchFoundException("No capital found for the country: " + country);
        }
    }

    public static void main(String[] args) {
        try {
            String country = "France";
            System.out.println("Capital: " + findCapital(country));
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
