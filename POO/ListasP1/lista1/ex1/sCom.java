public class sCom {

    protected int Sensibilidade;
    protected String Marca;
    protected int Hz;

    public sCom(int Sensibilidade, String Marca, int Hz) {
        this.Sensibilidade = Sensibilidade;
        this.Marca = Marca;
        this.Hz = Hz;
    }

    public int getSensibilidade() {
        return Sensibilidade;
    }

    public void setSensibilidade(int Sensibilidade) {
        this.Sensibilidade = Sensibilidade;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca){
        this.Marca = Marca;
    }

    public int getHz(){
        return Hz;
    }

    public void setHz(int Hz){
        this.Hz = Hz;
    }
}
