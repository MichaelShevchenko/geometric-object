public class Trapezoid extends GeometricObject {

    private static final String TRAPEZOID_SHAPE = "трапеция";
    private int heightLength;
    private int shortBase;
    private int longBase;

    public Trapezoid(Colour figuresColour, int heightLength, int shortBase, int longBase) {
        super(figuresColour);
        this.heightLength = heightLength;
        this.shortBase = shortBase;
        this.longBase = longBase;
    }

    public double midLine() {
        return (double) (shortBase + longBase) / 2;
    }

    @Override
    public double calculateArea() {
        return midLine() * heightLength;
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %.2f кв.ед., средняя линия: %.2f ед., цвет: %s",
                TRAPEZOID_SHAPE, calculateArea(), midLine(), getFiguresColour()));
    }
}
