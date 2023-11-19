class Teclado implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("Teclado ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Teclado desligado.");
    }

    @Override
    public int checarStatus() {
        System.out.println("Checando status do teclado.");
        return 4; // exemplo de retorno
    }

    @Override
    public void calibrar() {
        System.out.println("Calibrando teclado.");
    }
}
