public class Celular {

    protected String marca;
    protected Processador processador;
    protected sCom scom;
    protected sSom ssom;
    protected TelaTouch tela;

    //Irei praticar a ideia de Override, digo isso em questão de
    // vou criar dois "public Celular"
    public Celular(String marca, Processador processador,sSom sSom) {
        this.marca = marca;
        this.processador = processador;
    }

    public Celular(sCom scom, TelaTouch tela){
        this.scom = scom;
        this.tela = tela;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void printarCelular(){
        System.out.println("A marca é:" + this.marca+ ", O processador é: " + this.processador.getMarca() + " O clock: " + this.processador.getclock() + " Quantidade de núcleos: " + this.processador.getnucleos());
        System.out.println("O sistema de som é: " + this.ssom.getMarca() + " O volume atual é: " + this.ssom.getVolAtual());
        System.out.println("O sistema de comunicação é: " + this.scom.getMarca() + " A sensibilidade é: " + this.scom.getSensibilidade() + " O Hz é: " + this.scom.getHz());
    }
}
