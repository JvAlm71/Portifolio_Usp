public class Predio {

    protected int Num_Ap;
    protected Pessoa moradPessoa;

    public Predio(int Num_Ap, Pessoa moradPessoa) {
        this.Num_Ap = Num_Ap;
        this.moradPessoa = moradPessoa;
    }

    public Pessoa getMoradPessoa() {
        return moradPessoa;
    }
    public int getNum_Ap() {
        return Num_Ap;
    }
    public void setMoradPessoa(Pessoa moradPessoa) {
        this.moradPessoa = moradPessoa;
    }
    public void setNum_Ap(int num_Ap) {
        Num_Ap = num_Ap;
    }

    public void ImprimePredio(){
        System.out.println("O morador: " + this.moradPessoa.getNome() + " mora no apartamento: " + this.Num_Ap);
    }

    public String toString() {
        return "Predio [Num_Ap=" + Num_Ap + ", moradPessoa=" + moradPessoa.getNome() + "]";
    }
    
}
