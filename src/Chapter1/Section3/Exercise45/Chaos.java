package Chapter1.Section3.Exercise45;

public class Chaos {
    public static void main(String[] args) {
        double r = Double.parseDouble(args[0]);

        double x = 0.01;

        long time = 0;

        double limit = 1 - 1 / r;

        double nextValue = r * x * (1 - x);

        double EPSILON = 1e-5;

        while (Math.abs(nextValue - limit) > EPSILON) {
            time++;
            x = nextValue;
            System.out.println(time + ": " + x);
            nextValue = r * x * (1 - x);
        }
    }
}
