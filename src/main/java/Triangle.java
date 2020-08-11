public class Triangle extends GeometricObject {

    private static final String TRIANGLE_SHAPE = "треугольник";
    private int heightLength;
    private int base;

    public Triangle(Colour figuresColour, int heightLength, int base) {
        super(figuresColour);
        this.heightLength = heightLength;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * heightLength * base;
    }

    public double hypotenuseLength() {
        // since length of the medians for each side are differ and we're dealing the length of just 1 side,
        // let's assume that we're dealing with right triangle
        return Math.sqrt(base * base + heightLength * heightLength);
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %.2f кв.ед., гипотенуза: %.2f ед., цвет: %s",
                TRIANGLE_SHAPE, calculateArea(), this.hypotenuseLength(), getFiguresColour()));
    }
}
