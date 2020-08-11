public class Square extends GeometricObject {

    private static final String SQUARE_SHAPE = "квадрат";
    private int sideLength;

    public Square(Colour figuresColour, int sideLength) {
        super(figuresColour);
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return (double) sideLength * sideLength;
    }

    public double diagonal() {
        return Math.sqrt(2) * sideLength;
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %.2f кв.ед., диагональ: %.2f ед., цвет: %s",
                SQUARE_SHAPE, calculateArea(), diagonal(), getFiguresColour()));
    }
}
