// Classe Teste fornecida pelo professor
public class Main {
    public static void main(String args[]) {
        Oficina o = new Oficina();
        Veiculo v;

        // Adicionando veículos à oficina para garantir que haja pelo menos 4 veículos na fila
        o.adicionarVeiculo(new Bicicleta());
        o.adicionarVeiculo(new Automovel());
        o.adicionarVeiculo(new Bicicleta());
        o.adicionarVeiculo(new Automovel());

        for (int i = 0; i < 4; ++i) {
            v = o.proximo();
            o.manutencao(v);
        }
    }
}
