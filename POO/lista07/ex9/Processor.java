abstract class Processor {
    protected Processor successor;

    public void setSuccessor(Processor successor) {
        this.successor = successor;
    }

    public abstract void process(Number request);
}

