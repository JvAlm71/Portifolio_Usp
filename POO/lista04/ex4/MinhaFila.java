import java.lang.reflect.Array;


public class MinhaFila<T> {
    private int inicio, fim, tamanho, capacidade;
    private T[] elementos;

    public MinhaFila(int capacidade) {
        this.capacidade = capacidade;
        inicio = fim = tamanho = 0;
        elementos = (T[]) new Object[capacidade];
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public boolean estaCheia() {
        return tamanho == capacidade;
    }

    public void enfileirar(T elemento) throws FilaCheiaException {
        if (estaCheia()) {
            throw new FilaCheiaException();
        }
        elementos[fim] = elemento;
        fim = (fim + 1) % capacidade;
        tamanho++;
    }

    public T desenfileirar() throws FilaVaziaException {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        T elemento = elementos[inicio];
        elementos[inicio] = null;
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        return elemento;
    }

    public static class FilaCheiaException extends Exception {
        public FilaCheiaException() {
            super("Fila está cheia");
        }
    }

    public static class FilaVaziaException extends Exception {
        public FilaVaziaException() {
            super("Fila está vazia");
        }
    }
}
