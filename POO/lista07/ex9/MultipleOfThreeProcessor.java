class MultipleOfThreeProcessor extends Processor {
    public void process(Number request) {
        if (request.getValue() % 3 == 0) {
            System.out.println(request.getValue() + " is multiple of 3, square root: " + Math.sqrt(request.getValue()));
        } else if (successor != null) {
            successor.process(request);
        }
    }
}