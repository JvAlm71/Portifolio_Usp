public class GenericInsertionSort {
    public static <T extends Comparable<T>> void insertionSort(T[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            T key = array[i];
            int j = i - 1;

            // Move os elementos de array[0..i-1], que são maiores que a chave,
            // para uma posição à frente de suas posições atuais
            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
