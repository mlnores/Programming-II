public class CircleGE {
    private double x, y, r;

    CircleGE() {
        x = y = 0;
        r = 1;
    }

    CircleGE(double r) {
        x = y = 0;
        this.r = r;
    }

    CircleGE(double x, double y) {
        this.x = x;
        this.y = y;
        r = 1;
    }

    CircleGE(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double perimeter() {
        return 2 * Math.PI * r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public boolean contains(double x, double y) {
        double distance_to_center;
        distance_to_center = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return ((distance_to_center) <= r);
    }
}
