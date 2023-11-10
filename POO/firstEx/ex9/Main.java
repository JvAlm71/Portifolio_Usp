public class Main {
    public static void main(String[] args) {
        // Setup Chain of Responsibility
        Processor multipleOfTwo = new MultipleOfTwoProcessor();
        Processor multipleOfThree = new MultipleOfThreeProcessor();
        Processor otherNumber = new OtherNumberProcessor();

        multipleOfTwo.setSuccessor(multipleOfThree);
        multipleOfThree.setSuccessor(otherNumber);

        // Process a series of numbers
        int[] numbers = {2, 3, 4, 5, 15, 21, 22};
        for (int number : numbers) {
            multipleOfTwo.process(new Number(number));
        }
    }
}