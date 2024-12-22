//q17
class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        String[] library = {"Java Programming", "Data Structures", "Operating Systems"};
        String bookToFind = "AI for Beginners";

        try {
            boolean found = false;
            for (String book : library) {
                if (book.equals(bookToFind)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new BookNotFoundException("Book '" + bookToFind + "' not found.");
            } else {
                System.out.println("Book '" + bookToFind + "' found.");
            }
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
