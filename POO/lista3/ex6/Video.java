// Classe Vídeo
class Video implements Dispositivo {
    @Override
    public void ligar() {
        System.out.println("Vídeo ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Vídeo desligado.");
    }

    @Override
    public int checarStatus() {
        System.out.println("Checando status do vídeo.");
        return 1; // exemplo de retorno
    }

    @Override
    public void calibrar() {
        System.out.println("Calibrando vídeo.");
    }
}
