abstract public class Personagem {
    protected String nome;
    protected String nomeReal;
    SuperPoder poderes;

    public Personagem(String nome, String nomeReal, SuperPoder poderes) {
        this.nome = nome;
        this.nomeReal = nomeReal;
        this.poderes = poderes;
    }

    abstract String getNome();
    abstract String getNomeReal();
    abstract String getPoderes();
}
