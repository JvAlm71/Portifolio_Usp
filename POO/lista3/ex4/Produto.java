public class Produto{

    private int Codigo;
    private double PrecoUnitario;
    private String Descricao;
    private int QuantidadeNoEstoque;

    public Produto(int codigo, double precoUnitario, String descricao, int quantidadeNoEstoque) {
        Codigo = codigo;
        PrecoUnitario = precoUnitario;
        Descricao = descricao;
        QuantidadeNoEstoque = quantidadeNoEstoque;
    }

    public int RetiraEstoque(int quantidade){
        if(quantidade > QuantidadeNoEstoque){
            return -1;
        }
        QuantidadeNoEstoque -= quantidade;
        return 0;
    }

    public int AcrescentaEstoque(int quantidade){
        QuantidadeNoEstoque += quantidade;
        return 0;
    }

    public void ImprimeProduto(){
        System.out.println("Codigo: " + Codigo);
        System.out.println("Preco: " + PrecoUnitario);
        System.out.println("Nome Produto: " + Descricao);
        System.out.println("Quantidade: " + QuantidadeNoEstoque);
        System.out.println("---------------------------");
    }


    //get e setters
    public double getPreco(){
        return PrecoUnitario;
    }

    public String getDescrica(){
        return Descricao;
    }

    public int getQuantidade(){
        return QuantidadeNoEstoque;
    }

    public int getCodigo(){
        return Codigo;
    }

    public void setPreco(double preco){
        PrecoUnitario = preco;
    }

    public void setDescricao(String descricao){
        Descricao = descricao;
    }

}