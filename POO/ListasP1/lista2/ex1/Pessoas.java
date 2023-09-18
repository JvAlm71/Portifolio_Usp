public class Pessoas {

    protected String Nome;
    protected String CPF;
    protected String DataNascimento;

    public Pessoas(String Nome, String CPF, String DataNascimento) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.DataNascimento = DataNascimento;
    }

    public String getNome() {
        return Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

}
