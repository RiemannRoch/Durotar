package Chapter1.Section3.Exercise34;

public class SumOfTwoCubes {
    public static void main(String[] args) {

        long n = Long.parseLong(args[0]);

        long max = (long) Math.pow(n / 2.0, 1.0 / 3);

        System.out.println(max);

        int number = 0;

        for (long a = 1; a < max; a++) {
            long maxB = (long) Math.pow(n - a * a * a, 1.0 / 3);
            for (long b = a; b <= maxB; b++) {
                long candidate = a * a * a + b * b * b;
                for (long c = a + 1; c < max; c++) {
                    long maxD = candidate - c * c * c;
                    for (long d = c; d < maxD; d++) {
                        if (c * c * c + d * d * d == candidate) {
                            number++;
                            System.out.println(number + ": " + candidate + " = " + a + "^3 + " + b + "^3 = " + c + "^3 + " + d + "^3");
                        }
                    }
                }
            }
        }
    }
}
