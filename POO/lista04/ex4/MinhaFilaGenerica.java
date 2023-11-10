
public class MinhaFilaGenerica {

    public static void main(String[] args) {
        try {
            MinhaFila<Carro> mf = new MinhaFila<>(5);
            mf.enfileirar(new Carro("Chevrolet", "Celta", 2000));
            mf.enfileirar(new Carro("Ford", "EcoSport", 2005));
            mf.enfileirar(new Carro("Volkswagen", "Fusca", 1980));
            mf.enfileirar(new Carro("Nissan", "Kicks", 2015));
            mf.enfileirar(new Carro("BMW", "X1", 2020));

            // Uncomment the line below to cause a queue overflow exception
            // mf.enfileirar(new Carro("Toyota", "Corolla", 2022));

            while (!mf.estaVazia()) {
                System.out.println(mf.desenfileirar());
            }

            // Uncomment the line below to cause a queue underflow exception
            System.out.println(mf.desenfileirar());

            System.out.println("Proxima linha");
        } catch (MinhaFila.FilaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Tente aumentar a capacidade da fila");
        } catch (MinhaFila.FilaVaziaException e) {
            System.out.println(e.getMessage());
            System.out.println("Tente inserir alguma coisa na fila");
        } catch (Exception e) {
            System.out.println("Outro erro ocorreu, verifique seu codigo: " + e.getMessage());
        } finally {
            System.out.println("-------------------");
            System.out.println("Programa encerrado.");
        }
    }
}
