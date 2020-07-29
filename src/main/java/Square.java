public class Square extends GeometricObject {

    private String shape = "квадрат";

    public Square(int area, String color) {
        super(area, color);
    }

    public double sideLength() {
        double result = Math.sqrt(getArea());
        return result;
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %d кв.ед., длина стороны: %.2f ед., цвет: %s",
                shape, getArea(), this.sideLength(), getColor()));
    }
}
