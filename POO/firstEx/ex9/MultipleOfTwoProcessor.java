class MultipleOfTwoProcessor extends Processor {
    public void process(Number request) {
        if (request.getValue() % 2 == 0) {
            System.out.println(request.getValue() + " is multiple of 2, square: " + Math.pow(request.getValue(), 2));
        } else if (successor != null) {
            successor.process(request);
        }
    }
}