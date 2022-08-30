package Chapter1.Section3.Exercise28;
/**
 * All long values take less than 10 seconds
 * to run with factor <= factor/n;
 * The int 584522087 is a prime number and takes
 * approx 10 seconds to run with factor <= n*/
public class FactorPerformance {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        for (long factor = 2; factor <= n ; factor++) { // Test potential factor.
            if (n % factor == 0) System.out.print(factor + " ");
            while (n % factor == 0) { // Cast out and print factor.
                n /= factor;
            } // Any factor of n must be greater than factor.
        }
        if (n > 1) System.out.print(n);
        System.out.println();
    }
}
