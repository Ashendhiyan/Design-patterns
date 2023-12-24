package lk.ijse.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("Value is 2");
        subject.setState(2);
        System.out.println("\nValue is 14");
        subject.setState(14);
    }
}
