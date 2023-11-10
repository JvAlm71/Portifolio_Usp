import java.lang.Number;

public class ReceiveValue <V extends Number> {

    protected V first;
    protected V second;

    public ReceiveValue(V first, V second){
        this.first = first;
        this.second = second;
    }

    public V getMax(){
        return (first.doubleValue() > second.doubleValue()) ? first : second;
    }

    public V getMin(){
        return (first.doubleValue() < second.doubleValue()) ? first : second;
    }

    public String getString(){
        return first.toString() + " , " + second.toString();
    }
}
