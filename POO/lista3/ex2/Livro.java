public class Livro extends Produto{
    
    public String autor;

    public Livro(String autor, String descricao){
        super(descricao);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }


    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
}
