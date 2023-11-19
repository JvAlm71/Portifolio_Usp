class OtherNumberProcessor extends Processor {
    public void process(Number request) {
        System.out.println(request.getValue() + " is not multiple of 2 or 3, square: " + Math.pow(request.getValue(), 2));
    }
}