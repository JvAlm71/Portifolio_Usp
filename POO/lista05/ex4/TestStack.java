public class TestStack {
        public static void main(String[] args) {
            Stack stack = new Stack(3); // Create a stack with a capacity of 3 elements
    
            try {
                stack.push(1);
                stack.push(2);
                stack.push(3);
                // stack.push(4); // This should throw StackFullException
            } catch (StackFullException e) {
                System.out.println(e.getMessage());
            }
    
            try {
                System.out.println(stack.pop());
                System.out.println(stack.pop());
                System.out.println(stack.pop());
                System.out.println(stack.pop()); // This should throw StackEmptyException
            } catch (StackEmptyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
