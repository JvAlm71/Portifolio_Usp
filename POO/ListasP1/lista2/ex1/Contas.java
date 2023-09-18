public class Contas {
    
    Pessoas pessoas;
    protected boolean depositar;
    protected boolean sacar;
    protected boolean transferir;
    protected double saldo;

    public Contas(Pessoas pessoas, boolean depositar, boolean sacar, boolean transferir, double saldo) {
        this.pessoas = pessoas;
        this.depositar = depositar;
        this.sacar = sacar;
        this.transferir = transferir;
        this.saldo = saldo;
    }

   //get e setters
    public boolean getdepositar() {return depositar;}
    public boolean getsacar() {return sacar;}
    public boolean gettransferir() {return transferir;}
    public double getsaldo() {return saldo;}

    public void setdepositar(boolean depositar) {this.depositar = depositar;}
    public void setsacar(boolean sacar) {this.sacar = sacar;}
    public void settransferir(boolean transferir) {this.transferir = transferir;}
    public void setsaldo(double saldo) {this.saldo = saldo;}
}
