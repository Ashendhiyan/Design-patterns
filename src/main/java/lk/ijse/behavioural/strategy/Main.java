package lk.ijse.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        Context context1 = new Context(new AddOperation());
        System.out.println("Add Operation (4,3):" + context1.executeOperation(4,3));

        Context context2 = new Context(new SubstractOperation());
        System.out.println("Add Operation (4,3):" + context2.executeOperation(4,3));
    }
}

