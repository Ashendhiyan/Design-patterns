package lk.ijse.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redShapeDecorator1 = new RedShapeDecorator(new Circle());
        Shape redShapeDecorator2 = new RedShapeDecorator(new Rectangle());

        System.out.println("Without Decorator");
        circle.draw();
        System.out.println("\nWith redShape Decorator");
        redShapeDecorator1.draw();
        System.out.println("\nWith redShape Decorator");
        redShapeDecorator2.draw();
    }
}
