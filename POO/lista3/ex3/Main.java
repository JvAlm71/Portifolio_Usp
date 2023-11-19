public class Main{
    public static void main(String[] args) {
        
        Predio predios[] = new Predio[3];
        predios[0] = new Casa(5.0);
        predios[1] = new Escola(7.0);
        predios[2] = new Casa(5.0);

        for (Predio predio : predios) {
            System.out.println("Predio: " + predio.getCarbonoProduzido());
        }
        /*Casa casa = new Casa(5.0);
        Escola escola = new Escola(7.0);
        System.out.println("Casa: " + casa.getCarbonoProduzido());
        System.out.println("Escola: " + escola.getCarbonoProduzido());
    }*/
    }
}