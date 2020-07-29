public class Trapezoid extends GeometricObject {

    private String shape = "трапеция";

    public Trapezoid(int area, String color) {
        super(area, color);
    }

    public double heightLength() {
        // since we don't know the length of the sides, let's assume that we're dealing with
        // idealized isosceles trapezoid, where b = 3*a and h = a;
        double result = Math.sqrt(2) * Math.sqrt(getArea());
        return result;
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %d кв.ед., высота: %.2f ед., цвет: %s",
                shape, getArea(), this.heightLength(), getColor()));
    }
}
