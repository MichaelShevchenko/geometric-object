public class Triangle extends GeometricObject {

    private String shape = "треугольник";
    private String color;
    private int area;

    public Triangle(int area, String color) {
        this.area = area;
        this.color = color;
    }

    public double hypotenuseLength() {
        // since we don't know the length of the sides, let's assume that we're dealing with right triangle,
        // whose cathetus are equal
        double result = 2 * Math.sqrt(this.area);
        return result;
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %d кв.ед., гипотенуза: %.2f ед., цвет: %s",
                this.shape, this.area, this.hypotenuseLength(), this.color));
    }
}
