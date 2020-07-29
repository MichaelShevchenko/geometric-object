public class Triangle extends GeometricObject {

    private String shape = "треугольник";

    public Triangle(int area, String color) {
        super(area, color);
    }

    public double hypotenuseLength() {
        // since we don't know the length of the sides, let's assume that we're dealing with right triangle,
        // whose cathetus are equal
        double result = 2 * Math.sqrt(getArea());
        return result;
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %d кв.ед., гипотенуза: %.2f ед., цвет: %s",
                shape, getArea(), this.hypotenuseLength(), getColor()));
    }
}
