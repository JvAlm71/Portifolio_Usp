public class Calculadora{

    Usuario usarios;
    Operacoes operacoes;
    protected String Data;

    public Calculadora(Usuario usarios, Operacoes operacoes, String Data){
        this.usarios = usarios;
        this.operacoes = operacoes;
        this.Data = Data;
    }

    public void calcular(){
        operacoes.calcular();
    }

    //get e set
    public Usuario getUsarios() {return usarios;}
    public Operacoes getOperacoes() {return operacoes;}

    public void ImprimirDados(){
        System.out.println("Nome do usuario: "+usarios.getNome()+" O tipo de operacao é: "+operacoes.getOperacao()+" O resultado é: "+operacoes.getResultado()+" A data é: "+Data);
    }
}