public class SuperHeroi extends Personagem {

    public SuperHeroi(String nome, String nomeReal, SuperPoder poderes) {
        super(nome, nomeReal, poderes); // Chama o construtor da classe mãe
    }


    //Aqui estou pegando os atributos da classe mãe
    public String getNome() {return nome;}
    public String getNomeReal() {return nomeReal;}
    public String getPoderes() {return poderes.getNomeHabilidade();}
}
