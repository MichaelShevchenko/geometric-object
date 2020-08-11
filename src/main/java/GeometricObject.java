public abstract class GeometricObject {

    private Colour figuresColour;

    public GeometricObject(Colour figuresColour) {
        this.figuresColour = figuresColour;
    }

    public abstract double calculateArea();

    public abstract void getAttributes();

    public String getFiguresColour() {
        return figuresColour.getTranslation();
    }
}
