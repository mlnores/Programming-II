public class TestCirclesWithPrecomputing {
    public static void main(String[] args) {
        CircleWithPrecomputingAndDefects c1;
        c1 = new CircleWithPrecomputingAndDefects(0, 0, 3);
        System.out.println("Area of c1 after creation: " + c1.area());
        c1.r = 10;
        System.out.println("Area of c1 after changing the radius: " + c1.area());

        CircleWithPrecomputingAndGoodProtection c2;
        c2 = new CircleWithPrecomputingAndGoodProtection(0, 0, 3);
        System.out.println("Area of c2 after creation: " + c2.area());
        // c2.r = 10; <- This line would not compile
        c2.setR(10);
        System.out.println("Area of c2 after changing the radius: " + c2.area());
    }
}
