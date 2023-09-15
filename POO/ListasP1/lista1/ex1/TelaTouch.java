public class TelaTouch {

    protected double TamTela;
    protected String Marca;

    public TelaTouch(double TamTela, String Marca) {
        this.TamTela = TamTela;
        this.Marca = Marca;
    }

    public double getTamTela() {
        return TamTela;
    }

    public void setTamTela(double TamTela) {
        this.TamTela = TamTela;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca){
        this.Marca = Marca;
    }
}
