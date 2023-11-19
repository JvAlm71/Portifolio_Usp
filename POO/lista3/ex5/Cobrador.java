public class Cobrador{

    public double fTaxa;
    public double fSalario;

    public Cobrador(double taxa, double salario){
        fTaxa = taxa;
        fSalario = salario;
    }

    public double calcularPagamento(int abc, int def){
        return fSalario + fTaxa;
    }

    public double calcularPagamento(double taxa, double zsalario){
        return fSalario + taxa - zsalario;
    }

    //get e set
    
    public double getTaxa(){
        return fTaxa;
    }

    public void setTaxa(double taxa){
        fTaxa = taxa;
    }

    public double getSalario(){
        return fSalario;
    }

    public void setSalario(double salario){
        fSalario = salario;
    }
}