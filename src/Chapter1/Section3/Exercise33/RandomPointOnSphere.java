package Chapter1.Section3.Exercise33;

public class RandomPointOnSphere {
    public static void main(String[] args) {

        double x, y;
        do {
            x = 2.0 * Math.random() - 1.0;
            y = 2.0 * Math.random() - 1.0;
        } while (x * x + y * y > 1.0);

        double d = 2*Math.sqrt(1-x*x-y*y);
        System.out.println("a = " + x*d);
        System.out.println("b = " + d);
        System.out.println("c = " + (1-2*(x*x + y*y)));
    }
}
