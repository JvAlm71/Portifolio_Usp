import java.lang.Number;

public class Main{
    public static void main(String[] args) {
        ReceiveValue<Integer> intPair = new ReceiveValue<Integer>(71, 5);
        System.out.println("Max: " + intPair.getMax());
        System.out.println("Min: " + intPair.getMin());
        System.out.println("A String:" + intPair.getString());

        ReceiveValue <Double> doublePair = new ReceiveValue<Double>(5.0,7.5);
        System.out.println("Max: " + doublePair.getMax());
        System.out.println("Min: " + doublePair.getMin());
        System.out.println("A String:" + doublePair.getString());
    }
}
