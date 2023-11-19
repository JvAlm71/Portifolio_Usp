public class Main{
    public static void main(String[] args){
        Produto carrinho[] =  new Produto[3];
        carrinho[0] = new Mouse("Mouse", "Mouse sem fio");
        carrinho[1] = new Livro("Livro", "Livro de Java");
        carrinho[2] = new Mouse("Coco", "Gamer");
        // Dando pau nesse finalzinho

        for(int i = 0; i < carrinho.length; i++){
            System.out.println(carrinho[i]);
        }
    }
}