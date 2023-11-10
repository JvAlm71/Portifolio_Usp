
/**
 * The Flyweight pattern is a structural design pattern that focuses on sharing object instances to reduce memory usage and improve performance for applications with a large number of similar objects.
 * 
 * Purpose:
 * The primary purpose of the Flyweight pattern is to minimize memory usage by sharing as much data as possible with similar objects. It is especially useful when a program needs to create a huge number of similar objects.
 * 
 * How it works:
 * The Flyweight pattern works by separating the intrinsic state of the object (state that is shared and does not change) from the extrinsic state (state that varies between objects and can't be shared). The shared intrinsic state is stored in flyweight objects.
 * 
 * Flyweight objects are managed by a factory that ensures proper sharing of them. When a client requests a flyweight, the factory either returns an existing instance or creates a new one if it doesn't exist.
 * 
 * This pattern avoids redundancy by sharing instances that are identical in terms of their intrinsic state, thus saving memory. However, any state that must be unique for each object is not shared and is maintained externally by the client.
 * 
 * Example:
 * In Java, the Integer.valueOf(int) method uses the Flyweight pattern. It caches values in the range of -128 to 127 and returns the same instances for these values, thus avoiding the creation of duplicate Integer objects.
 * 
 * Use cases:
 * - Text formatting applications where character objects can be reused.
 * - Game development where multiple objects of the same type, like trees or bullets, are present.
 */
import java.util.HashMap;
import java.util.Map;

// The Flyweight interface
interface Shape {
    void draw();
}

// Concrete Flyweight class
class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}

// Flyweight Factory
class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}

// Client code
public class FlyweightPatternDemo {
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
