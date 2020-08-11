public class MainApp {
    public static void main(String[] args) {
        GeometricObject[] varietyOfObjects = new RandomGenerator().fillRandomly(11);
        for (GeometricObject element : varietyOfObjects) {
            element.getAttributes();
        }
    }
}
