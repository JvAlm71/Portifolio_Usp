public class Vilao extends Personagem {

    public int tempoDePrisao;
    public Vilao(int tempoDePrisao,String nome, String nomeReal, SuperPoder poderes) {
        super(nome, nomeReal, poderes); // Chama o construtor da classe mãe
        this.tempoDePrisao = tempoDePrisao;
    }
     
    //Aqui estou pegando os atributos da classe mãe
    public String getNome() {return nome;}
    public String getNomeReal() {return nomeReal;}
    public String getPoderes() {return poderes.getNomeHabilidade();}

    //get e set
    public int getTempoDePrisao() {return tempoDePrisao;}
    public void setTempoDePrisao(int tempoDePrisao) {this.tempoDePrisao = tempoDePrisao;}
}
