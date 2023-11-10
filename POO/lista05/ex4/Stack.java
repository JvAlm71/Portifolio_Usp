public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) throws StackFullException {
        if (top >= maxSize - 1) {
            throw new StackFullException();
        }
        stackArray[++top] = value;
    }

    public int pop() throws StackEmptyException {
        if (top < 0) {
            throw new StackEmptyException();
        }
        return stackArray[top--];
    }
}