public class Main {
    public static void main(String[] args) {
        // Criando alguns termos
        Termo termo1 = new Termo(2, 3);  // Representa 3x^2
        Termo termo2 = new Termo(1, -4); // Representa -4x
        Termo termo3 = new Termo(0, 5);  // Representa 5

        // Criando um polinômio e adicionando termos a ele
        Polinomio polinomio = new Polinomio();
        polinomio.adicionarTermo(termo1);
        polinomio.adicionarTermo(termo2);
        polinomio.adicionarTermo(termo3);

        // Imprimindo o polinômio
        System.out.println("Polinômio: " + polinomio);

        // Calculando e imprimindo o valor do polinômio para x = 2
        double valorParaX2 = polinomio.calcularValor(2);
        System.out.println("Valor do polinômio para x = 2: " + valorParaX2);

        // Calculando e imprimindo o valor do polinômio para x = -1
        double valorParaXNeg1 = polinomio.calcularValor(-1);
        System.out.println("Valor do polinômio para x = -1: " + valorParaXNeg1);
    }
}
