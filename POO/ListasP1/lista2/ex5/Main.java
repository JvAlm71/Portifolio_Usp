public class Main {
    public static void main(String[] args) {
        SuperHeroi herois[] = new SuperHeroi[3];
        Vilao viloes[] = new Vilao[3];
        SuperPoder poderes[] = new SuperPoder[3];

        poderes[0] = new SuperPoder(100, "Super Força");
        poderes[1] = new SuperPoder(100, "Super Velocidade");
        poderes[2] = new SuperPoder(100, "Super Inteligência");

        herois[0] = new SuperHeroi("Superman", "Clark Kent", poderes[0]);
        herois[1] = new SuperHeroi("Flash", "Barry Allen", poderes[1]);
        herois[2] = new SuperHeroi("Batman", "Bruce Wayne", poderes[2]);

        viloes[0] = new Vilao(100, "Lex Luthor", "Lex Luthor", poderes[0]);
        viloes[1] = new Vilao(100, "Zoom", "Hunter Zolomon", poderes[1]);
        viloes[2] = new Vilao(100, "Coringa", "Desconhecido", poderes[2]);

        // Imprimindo informações dos super-heróis
        System.out.println("Super-Heróis:");
        for (SuperHeroi heroi : herois) {
            System.out.println("Nome: " + heroi.getNome());
            System.out.println("Nome Real: " + heroi.getNomeReal());
            System.out.println("Poder: " + heroi.getPoderes());
            System.out.println("--------------------");
        }

        // Imprimindo informações dos vilões
        System.out.println("Vilões:");
        for (Vilao vilao : viloes) {
            System.out.println("Nome: " + vilao.getNome());
            System.out.println("Nome Real: " + vilao.getNomeReal());
            System.out.println("Poder: " + vilao.getPoderes());
            System.out.println("Tempo de Prisão: " + vilao.getTempoDePrisao());
            System.out.println("--------------------");
        }
    }
}
