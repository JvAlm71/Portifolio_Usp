public class Pessoa{
    protected String Nome;
    protected double Altura;
    protected double Peso;
    protected int Cpf;
    protected String EstadoCivil;

    //Esse método sera para pegar dados das condições fisicas da pessoa
    public Pessoa(String nome, double altura, double peso){
        this.Nome = nome;
        this.Altura = altura;
        this.Peso = peso;
    }

    //Aqui outro método ambos metódos se sobrescrevem depende das entradas
    public Pessoa(String nome, int cpf, String estadoCivil){
        this.Nome = nome;
        this.Cpf = cpf;
        this.EstadoCivil = estadoCivil;
    }

    public String getNome(){
        return this.Nome;
    }

    public void setNome(String nome){
        this.Nome = nome;
    }
    public double getAltura(){
        return this.Altura;
    }

    public void setAltura(double altura){
        this.Altura = altura;
    }

    public double getPeso(){
        return this.Peso;
    }
    public void setPeso(double peso){
        this.Peso = peso;
    }
    
    public int getCpf(){
        return this.Cpf;
    }

    public void setCpf(int cpf){
        this.Cpf = cpf;
    }
     public String getEstadoCivil(){
        return this.EstadoCivil;
     }

     public void setEstadoCivil(String estadoCivil){
         this.EstadoCivil = estadoCivil;
     }

     public void ImprimeDados1(){
        System.out.println(" O " + this.Nome + " tem " + this.Peso + " Kg e " + this.Altura + " de altura");
     }

     public void ImprimeDados2(){
        System.out.println(" O " + this.Nome + " tem " + this.Cpf + " de cpf e " + this.EstadoCivil + " de estado civil");
     }
}