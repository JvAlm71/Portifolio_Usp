public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("João", 1.80, 80.0);
        Pessoa pessoa1a = new Pessoa("João", 123456789, "Solteiro");
        Pessoa pessoa2 = new Pessoa("Julia", 474812821, "Casada");
        Pessoa pessoa2a = new Pessoa("João", 1.60, 71.0);
        
        pessoa1.ImprimeDados1();
        pessoa1a.ImprimeDados2();
        pessoa2.ImprimeDados1();
        pessoa2a.ImprimeDados2();

        //Moradia moradia1 = new Moradia("Rua Petunias", 384, "Santa Cruz");
        //Moradia moradia2 = new Moradia(pessoa1);
        //Moradia moradia3 = new Moradia("Rua da Azaleias", 2, "Bairro 2");
        //Moradia moradia4 = new Moradia(pessoa2);
        
        //moradia1.ImprimeMoradia1();
        //moradia2.ImprimeMoradia0();
        //moradia3.ImprimeMoradia1();
        //moradia4.ImprimeMoradia0();

        Casa casa1 = new Casa("Bege", 100.25, pessoa1);
      //  casa1.ImprimeCasa();

        Apartamento apartamento1 = new Apartamento("Azul", 50.0, pessoa2);
        //apartamento1.ImprimeApartamento();

        //casa1.ImprimeCustosCasa();
        //apartamento1.ImprimeCustosAp();

        Moradia moradias[] = new Moradia[3];

        moradias[0] = casa1;
        moradias[1] = apartamento1;

        for(Moradia moradia : moradias){
            System.out.println(moradia);
        }
    }
}
