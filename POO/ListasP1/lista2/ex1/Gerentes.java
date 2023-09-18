public class Gerentes {
    
    Contas contas;
    protected boolean cartadecredito;
    protected boolean emprestimo;
    protected boolean contabancaria;
    protected String NomesGerentes;

    public Gerentes(String NomeGerentes, Contas contas, boolean cartadecredito, boolean emprestimo, boolean contabancaria) {
        this.contas = contas;
        this.cartadecredito = cartadecredito;
        this.emprestimo = emprestimo;
        this.contabancaria = contabancaria;
        this.NomesGerentes = NomeGerentes;
    }

    //get e setters
    public boolean getcartadecredito() {return cartadecredito;}
    public boolean getemprestimo() {return emprestimo;}
    public boolean getcontabancaria() {return contabancaria;}
    public String getNomesGerentes() {return NomesGerentes;}

    public void setcartadecredito(boolean cartadecredito) {this.cartadecredito = cartadecredito;}
    public void setemprestimo(boolean emprestimo) {this.emprestimo = emprestimo;}
    public void setcontabancaria(boolean contabancaria) {this.contabancaria = contabancaria;}
    public void setNomesGerentes(String NomesGerentes) {this.NomesGerentes = NomesGerentes;}
    
}
