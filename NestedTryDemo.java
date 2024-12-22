//q15
public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            try {
                int num = Integer.parseInt(args[0]);
                System.out.println("First try block executed successfully.");
            } catch (NumberFormatException e) {
                System.out.println("Inner catch: Invalid number format.");
            }

            int[] arr = new int[5];
            System.out.println(arr[10]); // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index out of bounds.");
        }
    }
}
