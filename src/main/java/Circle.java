public class Circle extends GeometricObject {

    private String shape = "круг";

    public Circle(int radiusLength, Colour figuresColour) {
        super(radiusLength, figuresColour);
    }

    @Override
    public double calculateArea() {
        return Math.PI * getLength()* getLength();
    }

    public double circumference() {
        return Math.PI * getLength();
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %.2f кв.ед., длина окружности: %.2f ед., цвет: %s",
                shape, calculateArea(), circumference(), getFiguresColour()));
    }
}
