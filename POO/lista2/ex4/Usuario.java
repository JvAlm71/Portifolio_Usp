public class Usuario {

    protected String nome;
    protected String cpf;
    protected int idade;

    public Usuario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    //get e setters

    public String getNome() {return nome;}
    public String getCpf() {return cpf;}
    public int getIdade() {return idade;}

    public void setNome(String nome) {this.nome = nome;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public void setIdade(int idade) {this.idade = idade;}
}
