class Mouse implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("Mouse ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Mouse desligado.");
    }

    @Override
    public int checarStatus() {
        System.out.println("Checando status do mouse.");
        return 3; // exemplo de retorno
    }

    @Override
    public void calibrar() {
        System.out.println("Calibrando mouse.");
    }
}