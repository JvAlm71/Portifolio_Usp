public class Operacoes {

    protected float numero1;
    protected float numero2;
    protected float resultado;
    protected String operacao;

    public Operacoes(float numero1, float numero2, String operacao) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
    }

    public void calcular() {
        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                } else {
                    resultado = numero1 / numero2;
                }
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    //get e setters

    public float getNumero1() {return numero1;}
    public float getNumero2() {return numero2;}
    public float getResultado() {return resultado;}
    public String getOperacao() {return operacao;}

    public void setNumero1(float numero1) {this.numero1 = numero1;}
    public void setNumero2(float numero2) {this.numero2 = numero2;}
    public void setResultado(float resultado) {this.resultado = resultado;}
    public void setOperacao(String operacao) {this.operacao = operacao;}
}
