/*Basicamente o bloco finally é executado idependente 
 * de capturar um erro ou não, ele é executado sempre. Uma das suas funcionalidade seria
 * fechar um arquivo, ou seja, se o arquivo for aberto, ele será fechado, se não for aberto,
 * para que tenha certeza que o arquivo será fechado, o finally é utilizado. E haja uma 
 * forma segura de manter  o desempenho do programa.
 */

 public class ex2{
    public static void main(String[] args){
        try{
            int a = 10 / 0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e);
        }finally{
            System.out.println("O finally sempre será executado.");
        }
    }
 }