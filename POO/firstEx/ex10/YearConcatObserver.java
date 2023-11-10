import java.util.ArrayList;
import java.util.List;
import java.time.Year;

class YearConcatObserver implements StringObserver {
    public void update(String message) {
        System.out.println(message + Year.now().getValue());
    }
}