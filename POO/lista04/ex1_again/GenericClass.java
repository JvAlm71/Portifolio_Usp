public class GenericClass<T extends Number> {
    private T p1;
    private T p2;

    public GenericClass(T p1, T p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public T getMax(){
        if(p1.doubleValue() > p2.doubleValue()){
            return p1;
        }else{
            return p2;
        }
    }

    public T getMinT(){
        if(p1.doubleValue() < p2.doubleValue()){
            return p1;
        }else{
            return p2;
        }
    }

    public String toString(){
        return "p1: " + p1 + " p2: " + p2;
    }
}
