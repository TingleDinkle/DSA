// =============================================================
// Figure 51: Stack ADT — Encapsulation & Information Hiding
// =============================================================

public class StackADT {
    // Private data — hidden from user (encapsulation)
    private int[] data;
    private int top;

    // Constructor
    public StackADT(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    // Public methods — the interface (information hiding)
    public void push(int x) {
        if (top == data.length - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        top++;
        data[top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int value = data[top];
        top--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Main — demonstrate encapsulation
    public static void main(String[] args) {
        StackADT stack = new StackADT(5);

        // User interacts only through public methods
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek());  // 30
        System.out.println("Pop:  " + stack.pop());    // 30
        System.out.println("Pop:  " + stack.pop());    // 20
        System.out.println("Peek: " + stack.peek());  // 10
        System.out.println("Is empty? " + stack.isEmpty()); // false

        stack.pop();
        System.out.println("Is empty? " + stack.isEmpty()); // true

        // User CANNOT do: stack.data[0] = 999;  -> compile error!
        // User CANNOT do: stack.top = 5;         -> compile error!
        // This is encapsulation and information hiding.
    }
}

// ---- Expected Output ----
/*
Peek: 30
Pop:  30
Pop:  20
Peek: 10
Is empty? false
Is empty? true
*/
