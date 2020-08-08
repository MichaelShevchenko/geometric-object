import java.util.Random;

public class RandomGenerator {
    public GeometricObject[] fillRandomly(int n) {
        GeometricObject[] randomShapes = new GeometricObject[n];
        GeometricObject newObject = null;
        Random randomizer = new Random();
        Colour[] colors = Colour.values();
        for (int i = 0; i < n; i++) {
            int randomNumber = randomizer.nextInt(4);
            int randomColor = randomizer.nextInt(colors.length);
            int randomLength = randomizer.nextInt(2 * n);
            int randomShortBase = randomizer.nextInt(3 * n);
            int randomLongBase = randomizer.nextInt(2 * n) + randomShortBase;
            switch(randomNumber) {
                case 0:
                    newObject = new Triangle(randomLength, colors[randomColor], randomShortBase);
                    break;
                case 1:
                    newObject = new Square(randomLength, colors[randomColor]);
                    break;
                case 2:
                    newObject = new Circle(randomLength, colors[randomColor]);
                    break;
                case 3:
                    newObject = new Trapezoid(randomLength, colors[randomColor], randomShortBase, randomLongBase);
                    break;
            }
            randomShapes[i] = newObject;
        }
        return randomShapes;
    }
}
