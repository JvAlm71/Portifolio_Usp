

public class Apartamento extends Moradia{
    protected double Metragem;
    protected String Cor;
    protected double custo;

    public Apartamento(String Cor,double Metragem, Pessoa morador){
        super(morador);
        this.Metragem = Metragem;
        this.Cor = Cor;
        this.morador = morador;
    }

    public void ImprimeApartamento(){
        System.out.println("A cor do Apartamento é:" +this.Cor+ "Com tamanho de " +this.Metragem+"m2" +"E o morador é:" +this.morador.getNome());
    
    }

    public double CustoTotais(){
        return Metragem * 999;
    }

    public String toString() {
        return "Apartamento [Cor=" + Cor + ", Metragem=" + Metragem + ", Morador=" + morador.getNome() + "]";
    }
  /*   public void ImprimeCustosAp(){
        System.out.println("O Custo total para esse apartamento foi:" + CustoTotais());
    }*/
    
}