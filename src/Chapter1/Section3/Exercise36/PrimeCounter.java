package Chapter1.Section3.Exercise36;

public class PrimeCounter {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        if (n < 2) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(1);
        } else {
            int primes = 1;
            for (int i = 3; i <= n; i += 2) {
                boolean isPrime = true;
                for (int j = 3; j <= i / j; j += 2) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    primes++;
                }
            }
            System.out.println(primes);
        }

    }
}
