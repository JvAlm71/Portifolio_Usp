
/*Execeção é um erro que interrompe o fluxo normal do script.
 * Execeção verificada é uma exceção tratada, dentre os modos de tratamento
 * os mais comuns é utilizando o try catch e o throws.
 * Exceção não verificada é uma exceção não tratada.
 */
import java.io.EOFException;

// Abaixo está com o tratamento, verificando e tratando o erro.
public class ex1{
    public static void main(String[] args){
        try{
            int a = 10 / 0;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: " + e);
        }
    }
}

// sem o tratamento de erro, o programa irá parar de executar.

// public class ex1{
//     public static void main(String[] args){
//         int a = 10 / 0;
//     }
// }