public abstract class GeometricObject {

    private String color;
    private int area;

    public GeometricObject(int area, String color) {
        this.area = area;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getArea() {
        return area;
    }

    public abstract void getAttributes();
}
