
class LengthConcatObserver implements StringObserver {
    public void update(String message) {
        System.out.println(message + message.length());
    }
}