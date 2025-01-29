/* A class for circles, with better encapsulation */
public class CircleGoodEncapsulation {
    private double x, y, r;

    CircleGoodEncapsulation() {
        this(0,0,1);
    }

    CircleGoodEncapsulation(double r) {
        this(0,0,r);
    }

    CircleGoodEncapsulation(double x, double y) {
        this(x,y,1);
    }

    CircleGoodEncapsulation(double x, double y, double r) {
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
