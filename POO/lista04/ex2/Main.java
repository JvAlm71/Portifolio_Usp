public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {12, 11, 13, 5, 6};
        System.out.println("Array original:");
        for (int item : intArray) {
            System.out.print(item + " ");
        }
        System.out.println();

        GenericInsertionSort.insertionSort(intArray);

        System.out.println("Array ordenado:");
        for (int item : intArray) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
