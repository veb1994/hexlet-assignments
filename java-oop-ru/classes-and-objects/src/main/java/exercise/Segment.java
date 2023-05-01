package exercise;

// BEGIN
public class Segment {
    private final Point beginPoint;
    private final Point endPoint;
    private Point midPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public Point getBeginPoint() {
        return beginPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public Point getMidPoint() {
        int midPointX = (beginPoint.getX() + endPoint.getX()) / 2;
        int midPointY = (beginPoint.getY() + endPoint.getY()) / 2;
        midPoint = new Point(midPointX, midPointY);
        return midPoint;
    }
}
// END
