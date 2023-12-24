package lk.ijse.creational.factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape circle = factory.geShape("CIRCLE");
        circle.draw();
        Shape rectangle = factory.geShape("RECTANGLE");
        rectangle.draw();
        Shape square = factory.geShape("SQUARE");
        square.draw();
    }
}
