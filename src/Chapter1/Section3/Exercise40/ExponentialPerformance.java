package Chapter1.Section3.Exercise40;

/**
 * n = 1_152_990_000
 * x = 2.6881171418161356E43
 * Time = 9986ms
 * */

public class ExponentialPerformance {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);

        long t = System.currentTimeMillis();

        double x = 0.0;

        for (long i = 0; i < n; i++) {
            x = Math.exp(100);
        }
        System.out.println("n = " + n);
        System.out.println("x = " + x);
        System.out.println("Time = " + (System.currentTimeMillis() - t) + "ms");
    }
}
