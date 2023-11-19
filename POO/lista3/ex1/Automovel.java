public class Automovel extends Veiculo {
    @Override
    void listarVerificacoes() {
        System.out.println("Verificando pneus, motor e freios do automóvel.");
    }

    @Override
    void ajustar() {
        System.out.println("Ajustando automóvel.");
    }

    @Override
    void limpar() {
        System.out.println("Limpando automóvel.");
    }

    void trocarOleo() {
        System.out.println("Trocando óleo do automóvel.");
    }
}