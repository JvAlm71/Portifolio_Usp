public class Processador {

    protected String Marca;
    protected int clock;
    protected int nucleos;

    public Processador(String Marca, int clock, int nucleos) {
        this.Marca = Marca;
        this.clock = clock;
        this.nucleos = nucleos;
    }

    //get pegar o valor de um atributo smp
    public String getMarca() {
        return Marca;
    }
    //set alterar o valor de um atributo smp
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getclock(){
        return clock;
    }

    public void setclock(int clock){
        this.clock = clock;
    }

    public int getnucleos(){
        return nucleos;
    }

    public void setnucleos(int nucleos){
        this.nucleos = nucleos;
    }
}

