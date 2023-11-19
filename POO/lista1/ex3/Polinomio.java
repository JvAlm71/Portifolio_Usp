import java.util.ArrayList;
import java.util.List;

public class Polinomio {
    private List <Termo> termos;

    public Polinomio() {
        this.termos = new ArrayList<>();
    }

    // Adiciona um termo ao polinômio
    public void adicionarTermo(Termo termo) {
        termos.add(termo);
    }

    // Calcula o valor do polinômio para um dado x
    public double calcularValor(double x) {
        double soma = 0;
        for (Termo termo : termos) {
            soma += termo.getCoeficiente() * Math.pow(x, termo.getExpoente());
        }
        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Termo termo : termos) {
            sb.append(termo.getCoeficiente()).append("x^").append(termo.getExpoente()).append(" + ");
        }
        // Remove o último " + "
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 3);
        }
        return sb.toString();
    }
}
