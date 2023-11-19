public class Overload {

    public static void main(String[] args) {

    Cobrador cob1 = new Cobrador(2.0, 5.7);

    System.out.println(cob1.calcularPagamento(2, 3));
    System.out.println(cob1.calcularPagamento(2.0, 5.1));
}
}