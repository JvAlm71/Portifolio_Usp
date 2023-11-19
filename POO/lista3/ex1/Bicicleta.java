public class Bicicleta extends Veiculo {
    @Override
    void listarVerificacoes() {
        System.out.println("Verificando pneus, corrente e freios da bicicleta.");
    }

    @Override
    void ajustar() {
        System.out.println("Ajustando bicicleta.");
    }

    @Override
    void limpar() {
        System.out.println("Limpando bicicleta.");
    }
}
