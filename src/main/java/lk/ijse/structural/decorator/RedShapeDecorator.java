package lk.ijse.structural.decorator;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedShape(decoratorShape);
    }
    private void setRedShape(Shape decoratorShape){
        System.out.println("set red border");
    }
}
