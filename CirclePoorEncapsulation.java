/* A class for circles, with poor encapsulation */
public class CirclePoorEncapsulation {
    public double x, y; // center coordinates
    public double r; // radius

    public double perimeter() {
        return 2 * Math.PI * r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public boolean contains(double x, double y) {
        double distance_to_center = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return ((distance_to_center) <= r);
    }
}
