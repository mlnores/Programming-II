public class FirstTestCircles {
    public static void main(String[] args) {
        CirclePoorEncapsulation c1, c2; // References to 2 objects (still null)
        c1 = new CirclePoorEncapsulation();
        c1.x = c1.y = 2;
        System.out.println(c1.x + " " + c1.y + " " + c1.r); // Prints "2.0 2.0 0.0"
        System.out.println(c1.contains(0, 1)); // Prints "false"

        c2 = new CirclePoorEncapsulation();
        c2.r = 2;
        System.out.println(c2.x + " " + c2.y + " " + c2.r); // Prints "0.0 0.0 2.0"
        System.out.println(c2.contains(0, 1)); // Prints "true"

        c2 = c1; /*
                  * The reference c2 now points to the same CirclePoorEncapsulation as c1. This is when the
                  * garbage collector can remove the other CirclePoorEncapsulation from memory, because it is
                  * not referenced from anywhere.
                  */
        System.out.println(c2.x + " " + c2.y + " " + c2.r); // Prints "2.0 2.0 0.0”
    }
}
