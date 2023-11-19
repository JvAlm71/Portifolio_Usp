import java.io.Serializable;

public class DadosPessoais implements Serializable {
    private String nome;
    private int idade;
    private Endereco endereco;

    // Constructor
    public DadosPessoais(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
}
