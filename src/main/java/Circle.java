public class Circle extends GeometricObject {

    private String shape = "круг";
    private String color;
    private int area;

    public Circle(int area, String color) {
        this.area = area;
        this.color = color;
    }

    public double radiusLength() {
        double result = Math.sqrt(this.area * Math.PI);
        return result;
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %d кв.ед., радиус: %.2f ед., цвет: %s",
                this.shape, this.area, this.radiusLength(), this.color));
    }
}
