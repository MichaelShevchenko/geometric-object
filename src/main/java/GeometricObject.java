public abstract class GeometricObject {

    private Colour figuresColour;
    private int length;

    public GeometricObject(int length, Colour figuresColour) {
        this.length = length;
        this.figuresColour = figuresColour;
    }

    public abstract double calculateArea();

    public abstract void getAttributes();

    public int getLength() {
        return length;
    }

    public String getFiguresColour() {
        return figuresColour.getTranslation();
    }
}
