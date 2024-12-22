//q10

class RangeException extends Exception {
    public RangeException(String message) {
        super(message);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        try {
            String studentName = args[0];
            int totalMarks = 0;

            for (int i = 1; i <= 6; i++) {
                int marks = Integer.parseInt(args[i]);
                if (marks < 0 || marks > 50) {
                    throw new RangeException("Marks should be between 0 and 50.");
                }
                totalMarks += marks;
            }

            double percentage = (totalMarks / 300.0) * 100;
            System.out.println("Student: " + studentName);
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Percentage: " + percentage + "%");
        } catch (RangeException e) {
            System.out.println(e.getMessage());
        }
    }
}
