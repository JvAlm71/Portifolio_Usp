public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> g1 = new GenericClass(50, 2);
        System.out.println("Max (Integer): " + g1.getMax());
        System.out.println("Min (Integer): " + g1.getMinT());
        System.out.println(g1.toString());

        GenericClass<Double> g2 = new GenericClass(69.0, 2.9);
        System.out.println("Max (Integer): " + g2.getMax());
        System.out.println("Min (Integer): " + g2.getMinT());
        System.out.println(g2.toString());

    }
}