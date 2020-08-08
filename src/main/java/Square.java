public class Square extends GeometricObject {

    private String shape = "квадрат";

    public Square(int sideLength, Colour figuresColour) {
        super(sideLength, figuresColour);
    }

    @Override
    public double calculateArea() {
        return (double) getLength() * getLength();
    }

    public double diagonal() {
        return Math.sqrt(2) * getLength();
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %.2f кв.ед., диагональ: %.2f ед., цвет: %s",
                shape, calculateArea(), diagonal(), getFiguresColour()));
    }
}
