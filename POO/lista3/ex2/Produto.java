public class Produto {
    
    public String nomeloja;
    public double preco;
    public String descricao;

    public Produto(String nomeloja, double preco) {
        this.nomeloja = nomeloja;
        this.preco = preco;
    }

    public Produto(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Nome da Loja: " + nomeloja + ", Preço: " + preco + ", Descrição: " + descricao;
}

    //get e setters:
    public String getNomeloja() {
        return nomeloja;
    }

    public double getPreco() {
        return preco;
    }

    public String getdescricao() {
        return descricao;
    }
    
    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setdescricao(String descricao) {
       this.descricao = descricao;
    }
}
