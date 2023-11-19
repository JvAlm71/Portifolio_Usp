import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            CountingFilterInputStream countingStream = new CountingFilterInputStream(System.in);
            String line;
            line = "abcdedef";
            while ((line = countingStream.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
