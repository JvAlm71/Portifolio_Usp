import java.util.Calendar;
import java.util.Date;

public class ProdutoPerecivel extends Produto {
    private int DiasParaEstragar;

    public ProdutoPerecivel(int codigo, double precoUnitario, String descricao, int quantidadeNoEstoque, int diasParaEstragar) {
        super(codigo, precoUnitario, descricao, quantidadeNoEstoque);
        DiasParaEstragar = diasParaEstragar;
    }
    public int DataAtual = 20;
    public int DataParaEstragar = 30;

    public int RetirarDoEstoque(int quantidade){
        if(DataAtual < DataParaEstragar){
            int quantidadeNoEstoque = 0;
        }
        return 0;

    }

    public void ImprimeProduto() {
        super.ImprimeProduto();
        System.out.println("Dias para estragar: " + DiasParaEstragar);
    }

    //get e setters
    public int getDiasParaEstragar() {
        return DiasParaEstragar;
    }

    public void setDiasParaEstragar(int diasParaEstragar) {
        DiasParaEstragar = diasParaEstragar;
    }
}