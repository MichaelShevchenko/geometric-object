public class Triangle extends GeometricObject {

    private String shape = "треугольник";
    public int base;

    public Triangle(int heightLength, Colour figuresColour, int base) {
        super(heightLength, figuresColour);
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * getLength() * base;
    }

    public double hypotenuseLength() {
        // since length of the medians for each side are differ and we're dealing the length of just 1 side,
        // let's assume that we're dealing with right triangle
        return Math.sqrt(base * base + getLength() * getLength());
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %.2f кв.ед., гипотенуза: %.2f ед., цвет: %s",
                shape, calculateArea(), this.hypotenuseLength(), getFiguresColour()));
    }
}
