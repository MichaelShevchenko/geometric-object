public class Square extends GeometricObject {

    private String shape = "квадрат";
    private String color;
    private int area;

    public Square(int area, String color) {
        this.area = area;
        this.color = color;
    }

    public double sideLength() {
        double result = Math.sqrt(this.area);
        return result;
    }

    public void getAttributes() {
        System.out.println(String.format("Фигура: %s, площадь: %d кв.ед., длина стороны: %.2f ед., цвет: %s",
                this.shape, this.area, this.sideLength(), this.color));
    }
}
