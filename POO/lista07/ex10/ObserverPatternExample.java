import java.util.ArrayList;
import java.util.List;
import java.time.Year;

public class ObserverPatternExample {
    public static void main(String[] args) {
        StringSubject subject = new StringSubject();

        subject.attach(new UpperCaseObserver());
        subject.attach(new YearConcatObserver());
        subject.attach(new LengthConcatObserver());

        subject.receiveString("Pinto Grosso no Rego!!!");
    }
}
