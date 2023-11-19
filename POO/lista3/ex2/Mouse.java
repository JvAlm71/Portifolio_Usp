public class Mouse extends Produto{

    public String tipo;

    public Mouse(String tipo, String descricao){
        super(descricao);
        this.tipo = tipo;
    }

    @Override
        public String toString() {
        return super.toString() + ", Tipo: " + tipo;
    }


    public String getDescricao(){
        return descricao;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

   /*  public String imprimeProdutodeInfo(){
        return "Produto de Informatica";
    }*/ //não é necessário pois já está definido na classe Produto
}