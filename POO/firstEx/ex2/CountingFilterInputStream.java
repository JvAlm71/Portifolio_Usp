import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountingFilterInputStream extends FilterInputStream {
    private BufferedReader bufferedReader;
    private int characterCount;

    public CountingFilterInputStream(InputStream in) {
        super(in);
        this.bufferedReader = new BufferedReader(new InputStreamReader(in));
        this.characterCount = 0;
    }

    public String readLine() throws IOException {
        String line = bufferedReader.readLine();
        if (line != null) {
            characterCount += line.length();
            return characterCount + ": " + line;
        }
        return null;
    }

    // Override other methods as necessary
}