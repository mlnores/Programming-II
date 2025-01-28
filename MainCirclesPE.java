public class TestCirclesPE {
    public static void main(String[] args) {
        CirclePE c1, c2;
        c1 = new CirclePE();
        c1.x = 2;
        c1.y = 3;
        System.out.println(c1.x + " " + c1.y + " " + c1.r);
        System.out.println(c1.contains(0, 1));

        c2 = new CirclePE();
        c2.r = 2;
        System.out.println(c2.x + " " + c2.y + " " + c2.r);
        System.out.println(c2.contains(0, 1));
    }
}
