public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("João", "123456789-00", 20);
        Operacoes operacoes = new Operacoes(10, 2, "+");
        Calculadora calculadora = new Calculadora(usuario, operacoes, "18/09/2023");
        calculadora.calcular();
        calculadora.ImprimirDados();
        }
    
}
