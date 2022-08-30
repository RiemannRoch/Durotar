package Chapter1.Section3.Exercise40;

/**
 * numberOfOperations = 83000
 * Time = 10029ms
 * */

public class ExponentialPerformanceTwoForLoops {
    public static void main(String[] args) {
        long numberOfOperations = Long.parseLong(args[0]);

        long t = System.currentTimeMillis();

        double x = 100.0;

        for (long j = 0; j < numberOfOperations; j++) {
            double term = 1.0;
            double sum = 0.0;
            for (int n = 1; sum != sum + term; n++)
            {
                sum += term;
                term = 1.0;
                for (int i = 1; i <= n; i++) term *= x/i;
            }
        }

        System.out.println("numberOfOperations = " + numberOfOperations);
        System.out.println("Time = " + (System.currentTimeMillis() - t) + "ms");
    }
}
