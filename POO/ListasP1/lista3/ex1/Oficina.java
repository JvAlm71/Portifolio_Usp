import java.util.Queue;
import java.util.LinkedList;

// Classe Oficina
public class Oficina {
    private Queue<Veiculo> filaDeVeiculos = new LinkedList<>();

    // Adiciona um veículo à fila
    public void adicionarVeiculo(Veiculo v) {
        filaDeVeiculos.add(v);
    }

    // Retorna o próximo veículo da fila
    public Veiculo proximo() {
        return filaDeVeiculos.poll();
    }

    // Realiza a manutenção no veículo
    public void manutencao(Veiculo v) {
        v.listarVerificacoes();
        v.ajustar();
        v.limpar();
        if (v instanceof Automovel) {
            ((Automovel) v).trocarOleo();
        }
    }
}
