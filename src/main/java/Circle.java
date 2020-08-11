public class Circle extends GeometricObject {

    private static final String CIRCLE_SHAPE = "круг";
    private int radiusLength;

    public Circle(Colour figuresColour, int radiusLength) {
        super(figuresColour);
        this.radiusLength = radiusLength;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radiusLength * radiusLength;
    }

    public double circumference() {
        return Math.PI * radiusLength;
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %.2f кв.ед., длина окружности: %.2f ед., цвет: %s",
                CIRCLE_SHAPE, calculateArea(), circumference(), getFiguresColour()));
    }
}
