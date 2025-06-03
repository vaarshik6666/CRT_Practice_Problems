public class QueueUsingArrays {
    public static void main(String[] args) {

    }
}

class Queue1 {
    int[] queue;
    int front;
    int rear;
    int capacity;
    int size;

    Queue1(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int data) {
        if (size == capacity) {
            throw new RuntimeException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    int getSize() {
        return size;
    }

    int peek() {
        if (isEmpty()) {
            return -1;
        }
        return queue[front];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
