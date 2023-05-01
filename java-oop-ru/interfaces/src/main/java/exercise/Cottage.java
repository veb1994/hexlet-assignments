package exercise;

// BEGIN
public class Cottage implements Home {
    private final double area;
    private final int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public int compareTo(Home another) {
        return Double.compare(this.getArea(), another.getArea());
    }

    public String toString() {
        return String.format("%s этажный коттедж площадью %s метров", this.floorCount, this.getArea());
    }
}
// END
