public class Trapezoid extends GeometricObject {

    private String shape = "трапеция";
    public int shortBase;
    public int longBase;

    public Trapezoid(int heightLength, Colour figuresColour, int shortBase, int longBase) {
        super(heightLength, figuresColour);
        this.shortBase = shortBase;
        this.longBase = longBase;
    }

    public double midLine() {
        return (double) (shortBase + longBase) / 2;
    }

    @Override
    public double calculateArea() {
        return midLine() * getLength();
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %.2f кв.ед., средняя линия: %.2f ед., цвет: %s",
                shape, calculateArea(), midLine(), getFiguresColour()));
    }
}
