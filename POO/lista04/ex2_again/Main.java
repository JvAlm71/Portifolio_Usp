import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println("Before sorting: " + Arrays.toString(array));
        InsertionSort<Integer> insertionSort = new InsertionSort<>(array);
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}
