import java.util.ArrayList;
import java.util.List;
import java.time.Year;

class UpperCaseObserver implements StringObserver {
    public void update(String message) {
        System.out.println(message.toUpperCase());
    }
}