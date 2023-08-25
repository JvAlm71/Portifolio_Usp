public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("João", 1.80, 80.0);
        Pessoa pessoa1a = new Pessoa("João", 123456789, "Solteiro");
        
        pessoa1.ImprimeDados1();
        pessoa1a.ImprimeDados2();

        Moradia moradia1 = new Moradia("Rua 1", 1, "Bairro 1");
        Moradia moradia2 = new  Moradia(pessoa1a);
        
        moradia1.ImprimeMoradia1();
        moradia2.ImprimeMoradia0();

    }
}
