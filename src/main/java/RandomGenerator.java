import java.util.Random;

public class RandomGenerator {
    public static GeometricObject[] fillRandomly(int n) {
        GeometricObject[] randomShapes = new GeometricObject[n];
        GeometricObject newObject = null;
        Random randomizer = new Random();
        String[] colors = new String[] {"красный", "зеленый", "синий", "желтый",
                "белый", "черный", "фиолетовый", "берюзовый", "бежевый"};
        for (int i = 0; i < n; i++) {
            int randomNumber = randomizer.nextInt(4);
            int randomColor = randomizer.nextInt(colors.length);
            int randomArea = randomizer.nextInt(n * n * n);
            switch(randomNumber) {
                case 0:
                    newObject = new Triangle(randomArea, colors[randomColor]);
                    break;
                case 1:
                    newObject = new Square(randomArea, colors[randomColor]);
                    break;
                case 2:
                    newObject = new Circle(randomArea, colors[randomColor]);
                    break;
                case 3:
                    newObject = new Trapezoid(randomArea, colors[randomColor]);
                    break;
            }
            randomShapes[i] = newObject;
        }
        return randomShapes;
    }
}
