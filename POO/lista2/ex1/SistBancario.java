public class SistBancario {
    
    Gerentes gerentes;
    protected String NomeDoBanco;
    protected String CNPJ;
    Pessoas pessoas;
    Contas contas;

    public SistBancario(Contas contas, Pessoas pessoas, Gerentes gerentes, String NomeDoBanco, String CNPJ) {
        this.gerentes = gerentes;
        this.NomeDoBanco = NomeDoBanco;
        this.CNPJ = CNPJ;
        this.pessoas = pessoas;
        this.contas = contas;
    }

    //get e setters
    public String getNomeDoBanco() {return NomeDoBanco;}
    public String getCNPJ() {return CNPJ;}

    public void setNomeDoBanco(String NomeDoBanco) {this.NomeDoBanco = NomeDoBanco;}
    public void setCNPJ(String CNPJ) {this.CNPJ = CNPJ;}

    public void ImprimeSitBancario(){
        System.out.println("Nome do Banco: " + NomeDoBanco+ "CNPJ: " + CNPJ + "Os gerentes desse banco são:" + gerentes.getNomesGerentes());
        System.out.println("Os clientes desse banco são:"+ pessoas.getNome());
        System.out.println("O saldo dessa conta é: " + contas.getsaldo());
        System.out.println("O gerente dessa conta é: " + gerentes.getNomesGerentes());
    }
}
