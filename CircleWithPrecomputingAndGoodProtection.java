public class CircleWithPrecomputingAndGoodProtection {
    private double x, y, r;
    private double perimeter, area;

    CircleWithPrecomputingAndGoodProtection() {
        this(0,0,1);
    }

    CircleWithPrecomputingAndGoodProtection(double r) {
        this(0,0,r);
    }

    CircleWithPrecomputingAndGoodProtection(double x, double y) {
        this(x,y,1);
    }

    CircleWithPrecomputingAndGoodProtection(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        computeMeasures();
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
        computeMeasures();
    }

    public void computeMeasures() {
        perimeter = 2 * Math.PI * r;
        area = Math.PI * r * r;
    }

    public double perimeter() {
        return perimeter;
    }

    public double area() {
        return area;
    }

    public boolean contains(double x, double y) {
        double distance_to_center;
        distance_to_center = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return ((distance_to_center) <= r);
    }
}
