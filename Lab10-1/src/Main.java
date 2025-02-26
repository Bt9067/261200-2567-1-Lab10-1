public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(0);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(1);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(2);
        shape3.draw();

        Shape shape4 = shapeFactory.getShape(2);
        shape4.draw();

        Shape shape5 = shapeFactory.getShape(2);
        shape5.draw();

        Shape shape6 = shapeFactory.getShape(0);
        shape6.draw();
    }
}