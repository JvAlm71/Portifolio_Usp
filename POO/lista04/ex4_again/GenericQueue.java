public class GenericQueue<T> {
    private int front, rear, size, capacity;
    private T[] queue;

    public GenericQueue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        queue = (T[]) new Object[capacity];
    }

    public boolean ifFull() {
        return (this.size == this.capacity);
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }

    public void enqueue(T item) {
        if (ifFull()) {
            System.out.println("Queue is full");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.queue[this.rear] = item;
        this.size = this.size + 1;
    }

    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        T item = this.queue[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
    }

    public class QueueFullException {
    }

    
}
