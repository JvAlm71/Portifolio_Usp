import java.util.ArrayList;
import java.util.List;
import java.time.Year;

class StringSubject {
    private List<StringObserver> observers = new ArrayList<>();
    private String message;

    public void attach(StringObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (StringObserver observer : observers) {
            observer.update(message);
        }
    }

    public void receiveString(String message) {
        this.message = message;
        notifyObservers();
    }
}