class VideoFactory extends DispositivoFactory {
    @Override
    public Dispositivo criarDispositivo() {
        return new Video();
    }
}