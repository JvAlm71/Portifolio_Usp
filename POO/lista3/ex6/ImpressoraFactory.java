class ImpressoraFactory extends DispositivoFactory {
    @Override
    public Dispositivo criarDispositivo() {
        return new Impressora();
    }
}