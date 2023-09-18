
public class Main{
    public static void main(String[] args){

        sSom s1 = new sSom(10, "JBL");
        Processador p1 = new Processador("Qualcomm",123,41);
        Celular celular = new Celular("Samsung",p1,s1);
        celular.printarCelular();
    }
}