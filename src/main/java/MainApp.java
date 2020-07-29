public class MainApp {
    public static void main(String[] args) {
        GeometricObject[] varietyOfObjects = RandomGenerator.fillRandomly(10);
        for (GeometricObject element : varietyOfObjects) {
            element.getAttributes();
        }
    }
}
