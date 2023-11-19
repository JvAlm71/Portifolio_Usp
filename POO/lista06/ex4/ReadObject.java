import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("dadosPessoais.gz");
             GZIPInputStream gzis = new GZIPInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(gzis)) {

            DadosPessoais dados = (DadosPessoais) ois.readObject();
            System.out.println("Dados lidos: " + dados.getNome() + ", " + dados.getIdade() + ", " + dados.getEndereco().getCidade());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
