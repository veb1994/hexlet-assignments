package exercise;

// BEGIN
public class Circle {
    Point centerCoordinates;
    int radius;

    public Circle(Point centerCoordinates, int radius) {
        this.centerCoordinates = centerCoordinates;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (!(radius < 0)) {
            return Math.PI * radius * radius;
        } else {
            throw new NegativeRadiusException("");
        }
    }
}
// END
