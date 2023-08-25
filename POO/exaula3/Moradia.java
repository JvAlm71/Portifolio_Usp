public class Moradia {
    protected String Endereco;
    protected int Numero;
    protected String Bairro;
    protected Pessoa morador;

    public Moradia(String endereco, int numero, String bairro){
        this.Endereco = endereco;
        this.Numero = numero;
        this.Bairro = bairro;
    }

    public Moradia(Pessoa morador){
        this.morador = morador;
    }

    public String getBairro() {
        return Bairro;
    }
    public int getNumero() {
        return Numero;
    }
    public String getEndereco() {
        return Endereco;
    }
    public Pessoa getMorador() {
        return morador;
    }
    public String seString(){
        return "Endereço: " + this.Endereco + " Número: " + this.Numero + " Bairro: " + this.Bairro;
    }
    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public void ImprimeMoradia0(){
        System.out.println("O morador: " + this.morador.getNome());
    }
    public void ImprimeMoradia1(){
        System.out.println(" mora na " + this.Endereco + " Número " + this.Numero + " no bairro " + this.Bairro);
    }
}
