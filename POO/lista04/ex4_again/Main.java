import java.lang.Exception;
public class Main {
    public static void main(String[] args) {
        // Create a queue with a capacity of 5
        GenericQueue<String> queue = new GenericQueue<>(5);

        try {
            // Enqueue items
            queue.enqueue("Item 1");
            queue.enqueue("Item 2");
            queue.enqueue("Item 3");
            queue.enqueue("Item 4");
            queue.enqueue("Item 5");

            // This will throw an exception because the queue is full
            queue.enqueue("Item 6");
        } catch (GenericQueue.QueueFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Dequeue items
            while (!queue.isEmpty()) {
                System.out.println(queue.dequeue());
            }

            // This will throw an exception because the queue is empty
            System.out.println(queue.dequeue());
        } catch (GenericQueue.QueueEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
