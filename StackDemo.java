// =============================================================
// Figures 11–18: Stack using Array — Push & Pop
// (Also covers Figures 36–43 which describe the same stack)
// =============================================================

// Figure 11 / Figure 36: Node class
class StackNode {
    int data;

    StackNode(int data) {
        this.data = data;
    }
}

// Figure 12 / Figure 37: Initialize the stack
class MyStack {
    int top;
    int max;
    StackNode[] stackArray;

    // Constructor — stack is empty at -1
    MyStack(int size) {
        this.max = size;
        this.top = -1;
        this.stackArray = new StackNode[max];
    }

    // Figure 13 / Figure 38: Stack validation
    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == max - 1;
    }

    // Figure 14 / Figure 39: Push operation
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + value);
            return;
        }
        top++;
        stackArray[top] = new StackNode(value);
        System.out.println("Pushed: " + value);
    }

    // Figure 15 / Figure 40: Pop operation
    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return;
        }
        System.out.println("Popped: " + stackArray[top].data);
        stackArray[top] = null;
        top--;
    }

    // Figure 17 / Figure 42: Print function
    void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top -> bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i].data + " ");
        }
        System.out.println();
    }
}

// Figure 16 / Figure 41: Main function
public class StackDemo {
    public static void main(String[] args) {
        MyStack ms = new MyStack(5); // max = 5

        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        ms.push(5);

        System.out.println();
        ms.printStack();

        // Try to push when full
        ms.push(6); // Stack is full!

        System.out.println();

        // Pop twice
        ms.pop();
        ms.pop();

        System.out.println();
        ms.printStack();
    }
}

// ---- Figure 18 / Figure 43: Expected Output ----
/*
Pushed: 1
Pushed: 2
Pushed: 3
Pushed: 4
Pushed: 5

Stack (top -> bottom): 5 4 3 2 1
Stack is full! Cannot push 6

Popped: 5
Popped: 4

Stack (top -> bottom): 3 2 1
*/
