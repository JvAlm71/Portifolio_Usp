import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<TimeDefutebol> times = new ArrayList<>();

        TimeDefutebol time1 = new TimeDefutebol("Guarani", 11, 4, 3, 40, 30);
        TimeDefutebol time2 = new TimeDefutebol("Lemense", 11, 4, 2, 50, 20);

        times.add(time1);
        times.add(time2);
        times.add(new TimeDefutebol("São Paulo", 10, 5, 2, 35, 20));
        times.add(new TimeDefutebol("Palmeiras", 8, 6, 3, 30, 18));
        times.add(new TimeDefutebol("Corinthians", 9, 4, 4, 28, 22));
        times.add(new TimeDefutebol("Santos", 7, 7, 3, 25, 19));
        times.add(new TimeDefutebol("Flamengo", 11, 3, 3, 40, 15));

        for (TimeDefutebol time : times) {
            System.out.println("Time: " + time.getNome() + " | Pontos: " + time.calcularPontos());
        }
        
        if(time1.compareTo(time2) > 0) {
            System.out.println("Time 1 é melhor que o time 2");
        } else {
            System.out.println("Time 2 é melhor que o time 1");
        }
    }
}
