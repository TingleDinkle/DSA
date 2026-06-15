// =============================================================
// Figures 19–26: Queue using Array — Enqueue & Dequeue
// =============================================================

// Figure 19: Node class
class QueueNode {
    int data;

    QueueNode(int data) {
        this.data = data;
    }
}

// Figure 20: Array Queue
class MyQueue {
    int max;
    int first;
    int last;
    int size;
    QueueNode[] queueArray;

    // Constructor — initialize the Queue
    MyQueue(int capacity) {
        this.max = capacity;
        this.first = 0;
        this.last = -1;
        this.size = 0;
        this.queueArray = new QueueNode[max];
    }

    // Figure 21: Data validation
    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    // Figure 22: Enqueue operation
    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + value);
            return;
        }
        last++;
        queueArray[last] = new QueueNode(value);
        size++;
        System.out.println("Enqueued: " + value);
    }

    // Figure 23: Dequeue operation
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return;
        }
        System.out.println("Dequeued: " + queueArray[first].data);
        queueArray[first] = null;
        first++;
        size--;
    }

    // Figure 24: Print function
    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue (front -> rear): ");
        for (int i = first; i <= last; i++) {
            if (queueArray[i] != null) {
                System.out.print(queueArray[i].data + " ");
            }
        }
        System.out.println();
    }
}

// Figure 25: Main function
public class QueueDemo {
    public static void main(String[] args) {
        MyQueue mq = new MyQueue(10);

        // Enqueue some elements
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        mq.enqueue(4);
        mq.enqueue(5);

        System.out.println();
        mq.printQueue();

        System.out.println();

        // Dequeue the first element
        mq.dequeue();

        System.out.println();
        mq.printQueue();

        System.out.println();

        // Enqueue 2 more nodes
        mq.enqueue(6);
        mq.enqueue(7);

        System.out.println();
        mq.printQueue();
    }
}

// ---- Figure 26: Expected Output ----
/*
Enqueued: 1
Enqueued: 2
Enqueued: 3
Enqueued: 4
Enqueued: 5

Queue (front -> rear): 1 2 3 4 5

Dequeued: 1

Queue (front -> rear): 2 3 4 5

Enqueued: 6
Enqueued: 7

Queue (front -> rear): 2 3 4 5 6 7
*/
