import java.util.ArrayList;

public class NotificationService {
    private ArrayList<EmailMsgListener> customers;

    public NotificationService() {
        customers = new ArrayList<EmailMsgListener>();
    }

    public void subscribe(EmailMsgListener listener) {
        customers.add(listener);
    }

    public void unsubscribe(EmailMsgListener listener) {
        customers.remove(listener);
    }

    public void notifyListeners() {
        customers.forEach(listener->listener.update());
    }

    public void getNotification() {
        notifyListeners();
    }
}