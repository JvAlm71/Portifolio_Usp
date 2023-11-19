public class SuperPoder {
    protected int Forca;
    protected String NomeHabilidade;

    public SuperPoder(int Forca, String NomeHabilidade) {
        this.Forca = Forca;
        this.NomeHabilidade = NomeHabilidade;
    }

    public int getForca() {
        return Forca;
    }
    
    public String getNomeHabilidade() {
        return NomeHabilidade;
    }

    public void setForca(int Forca) {
        this.Forca = Forca;
    }

    public void setNomeHabilidade(String NomeHabilidade) {
        this.NomeHabilidade = NomeHabilidade;
    }

}
