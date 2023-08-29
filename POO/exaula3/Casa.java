
public class Casa extends Moradia{
    protected double Metragem;
    protected String Cor;

    public Casa(String Cor,double Metragem, Pessoa morador){
        super(morador);
        this.Metragem = Metragem;
        this.Cor = Cor;
        this.morador = morador;
    }

    public void ImprimeCasa(){
        System.out.println("A cor da casa é:" +this.Cor+ "Com tamanho de " +this.Metragem+"m2" +"E o morador é:" +this.morador.getNome());
    
    }

    public double CustoTotaisCasa(){
        return Metragem * 1000;
    }


    public String toString() {
        
    return "Casa [Cor=" + Cor + ", Metragem=" + Metragem + ", Morador=" + morador.getNome() + "]";
        
        }

   /*  public void ImprimeCustosCasa(){
        System.out.println("O Custo total para esse casa foi:" + CustoTotaisCasa());
    }
     */
}
