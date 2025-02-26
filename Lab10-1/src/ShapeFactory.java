public class ShapeFactory {
    public static final int TYPE_CIRCLE = 0;
    public static final int TYPE_RECTANGLE = 1;
    public static final int TYPE_SQUARE = 2;

    private static final int MAX_INSTANCES_PER_SHAPE = 2;
    private static final int MAX_TOTAL_INSTANCES = 5;

    private static int circleCount = 0;
    private static int rectangleCount = 0;
    private static int squareCount = 0;
    private static int totalShapes = 0;

    public static Shape getShape(int shapeType) {
        if (shapeType < 0) return null;

        if (totalShapes >= MAX_TOTAL_INSTANCES) {
            System.out.println("Maximum total number of Shapes reached.");
        }

        switch (shapeType) {
            case TYPE_CIRCLE:
                if (circleCount < MAX_INSTANCES_PER_SHAPE) {
                    circleCount++;
                    totalShapes++;
                    return new Circle();
                } else {
                    System.out.println("Circle limit reached!");
                    return null;
                }

            case TYPE_RECTANGLE:
                if (rectangleCount < MAX_INSTANCES_PER_SHAPE) {
                    rectangleCount++;
                    totalShapes++;
                    return new Rectangle();
                } else {
                    System.out.println("Rectangle limit reached!");
                    return null;
                }

            case TYPE_SQUARE:
                if (squareCount < MAX_INSTANCES_PER_SHAPE) {
                    squareCount++;
                    totalShapes++;
                    return new Square();
                } else {
                    System.out.println("Square limit reached!");
                    return null;
                }

            default:
                System.out.println("Invalid shape type: " + shapeType);
                return null;
        }
    }
}
