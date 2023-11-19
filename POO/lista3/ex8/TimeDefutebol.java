import java.util.Random;

public class TimeDefutebol implements Comparable  {

    private String Nome;
    private int NumeroVitorias;
    private int NumeroEmpates;
    private int NumeroDerrotas;
    private int NumeroGolsMarcados;
    private int NumeroGolsSofridos;

    // Construtor
    public TimeDefutebol(String Nome, int NumeroVitorias, int NumeroEmpates, int NumeroDerrotas, int NumeroGolsMarcados, int NumeroGolsSofridos) {
        this.Nome = Nome;
        this.NumeroVitorias = NumeroVitorias;
        this.NumeroEmpates = NumeroEmpates;
        this.NumeroDerrotas = NumeroDerrotas;
        this.NumeroGolsMarcados = NumeroGolsMarcados;
        this.NumeroGolsSofridos = NumeroGolsSofridos;
    }

    // Método para calcular os pontos
    public int calcularPontos() {
        return NumeroVitorias * 3 + NumeroEmpates;
    }

    public int compareTo(Object o){
        TimeDefutebol t = (TimeDefutebol) o;
        if(this.calcularPontos() > t.calcularPontos()){
            return 1; // time1 tem mais pontos
        } else if(this.calcularPontos() < t.calcularPontos()){
            return -1; // time1 tem menos pontos
        } else {
            Random r = new Random();
            int sorteio = r.nextInt(3) - 1; // isso gerará um número entre -1, 0 e 1
            return sorteio;
        }
    }
    
    

    // Getters e Setters
    public String getNome() { return Nome; }
    public void setNome(String Nome) { this.Nome = Nome; }
    public int getNumeroVitorias() { return NumeroVitorias; }
    public void setNumeroVitorias(int NumeroVitorias) { this.NumeroVitorias = NumeroVitorias; }
    public int getNumeroEmpates() { return NumeroEmpates; }
    public void setNumeroEmpates(int NumeroEmpates) { this.NumeroEmpates = NumeroEmpates; }
    public int getNumeroDerrotas() { return NumeroDerrotas; }
    public void setNumeroDerrotas(int NumeroDerrotas) { this.NumeroDerrotas = NumeroDerrotas; }
    public int getNumeroGolsMarcados() { return NumeroGolsMarcados; }
    public void setNumeroGolsMarcados(int NumeroGolsMarcados) { this.NumeroGolsMarcados = NumeroGolsMarcados; }
    public int getNumeroGolsSofridos() { return NumeroGolsSofridos; }
    public void setNumeroGolsSofridos(int NumeroGolsSofridos) { this.NumeroGolsSofridos = NumeroGolsSofridos; }
}
