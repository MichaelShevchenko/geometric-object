public class Circle extends GeometricObject {

    private String shape = "круг";

    public Circle(int area, String color) {
        super(area, color);
    }

    public double radiusLength() {
        double result = Math.sqrt(getArea() * Math.PI);
        return result;
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %d кв.ед., радиус: %.2f ед., цвет: %s",
                shape, getArea(), this.radiusLength(), getColor()));
    }
}
