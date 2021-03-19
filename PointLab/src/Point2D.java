public class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D () {
        this.x = 0.0;
        this.y = 0.0;
    }

    public double getX () {
        return this.x;
    }

    public double getY () {
        return this.y;
    }

    public void setX ( double val) {
        this.x = val;
    }

    public void setY ( double val) {
        this.y = val;
    }
}
