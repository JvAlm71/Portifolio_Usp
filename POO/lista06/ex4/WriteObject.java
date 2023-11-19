import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        DadosPessoais dados = new DadosPessoais("João", 30, new Endereco("Rua A", "São Paulo", "SP", "12345-678"));

        try (FileOutputStream fos = new FileOutputStream("dadosPessoais.gz");
             GZIPOutputStream gzos = new GZIPOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(gzos)) {

            oos.writeObject(dados);
            System.out.println("Dados pessoais escritos com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
