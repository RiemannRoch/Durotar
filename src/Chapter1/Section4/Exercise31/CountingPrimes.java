package Chapter1.Section4.Exercise31;



// This program takes aprox 14s to execute with n = 2*10^7,
// 50 times less than the other approach.
public class CountingPrimes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int primeCounter = 0;

        if (n < 2) {
            System.out.println("Invalid input");
            return;
        }

        for (int i = 2; i <= n; i++) {
            int factor;
            for (factor = 2; factor <= i / factor; factor++) {
                if (i % factor == 0) {
                    break;
                }
            }
            if (factor > i/factor) {
                primeCounter++;
            }
        }

        System.out.println("Number of prime less than or equal to " + n + ": " + primeCounter);
    }
}
