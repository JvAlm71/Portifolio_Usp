public class Carro {
    private String fabricante;
    private String modelo;
    private int ano;

    public Carro(String fabricante, String modelo, int ano) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    public String toString() {
        return "Carro: " +fabricante+ " Modelo:" +modelo+ " Ano: " +ano;
    }
}

