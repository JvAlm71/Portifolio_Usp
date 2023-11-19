public class sSom {
    
    protected int VolAtual;
    protected String Marca;

    public sSom(int VolAtual, String Marca) {
        this.VolAtual = VolAtual;
        this.Marca = Marca;
    }

    public int getVolAtual() {
        return VolAtual;
    }

    public void setVolAtual(int VolAtual) {
        this.VolAtual = VolAtual;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca){
        this.Marca = Marca;
    }   
}
