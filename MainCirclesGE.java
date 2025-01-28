public class MainCirclesGE {
    public static void main(String[] args) {
        CircleGE c1, c2;
        c1 = new CircleGE(2, 3);
        System.out.println(c1.getX() + " " + c1.getY() + " " + c1.getR());
        System.out.println(c1.contains(0, 1));

        c2 = new CircleGE(2);
        System.out.println(c2.getX() + " " + c2.getY() + " " + c2.getR());
        System.out.println(c2.contains(0, 1));
    }
}