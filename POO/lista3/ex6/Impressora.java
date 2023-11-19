class Impressora implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("Impressora ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Impressora desligada.");
    }

    @Override
    public int checarStatus() {
        System.out.println("Checando status da impressora.");
        return 2; // exemplo de retorno
    }

    @Override
    public void calibrar() {
        System.out.println("Calibrando impressora.");
    }
}