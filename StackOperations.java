
//q24
class StackFullException extends Exception {
    public StackFullException(String message) {
        super(message);
    }
}

class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}

class Stack {
    private int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int data) throws StackFullException {
        if (top == stack.length - 1) {
            throw new StackFullException("Stack is full. Cannot push more elements.");
        }
        stack[++top] = data;
        System.out.println("Pushed: " + data);
    }

    public int pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty. Cannot pop elements.");
        }
        return stack[top--];
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        try {
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            stack.push(60); // this will cause StackFullException
        } catch (StackFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            while (true) {
                System.out.println("Popped: " + stack.pop());
            }
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
