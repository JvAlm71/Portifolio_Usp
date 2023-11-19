public class Main {
    public static void main(String[] args) {
        DispositivoFactory videoFactory = new VideoFactory();
        DispositivoFactory impressoraFactory = new ImpressoraFactory();

        Dispositivo video = videoFactory.criarDispositivo();
        Dispositivo impressora = impressoraFactory.criarDispositivo();

        video.ligar();
        impressora.ligar();

        video.checarStatus();
        impressora.checarStatus();

        video.calibrar();
        impressora.calibrar();

        video.desligar();
        impressora.desligar();
    }
}

