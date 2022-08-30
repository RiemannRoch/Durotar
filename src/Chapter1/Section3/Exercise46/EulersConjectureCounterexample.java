package Chapter1.Section3.Exercise46;

/**
 * a = 27
 * b = 84
 * c = 110
 * d = 133
 * e = 133
 * */

public class EulersConjectureCounterexample {
    public static void main(String[] args) {

        boolean done = false;

        for (long e = 1; !done; e++) {
            long power = e * e * e * e * e;
            long aLimit = (long) Math.pow(power / 4.0, .2);
            for (long a = 1; a <= aLimit && !done; a++) {
                long aRemainder = power - a * a * a * a * a;
                long bLimit = (long) Math.pow(aRemainder / 3.0, .2);
                for (long b = 1; b <= bLimit && !done; b++) {
                    long bRemainder = aRemainder - b * b * b * b * b;
                    long cLimit = (long) Math.pow(bRemainder / 2.0, .2);
                    for (long c = 1; c <= cLimit && !done; c++) {
                        long cRemainder = bRemainder - c * c * c * c * c;
                        long dLimit = (long) Math.pow(cRemainder, .2);
                        for (long d = 1; d <= dLimit && !done; d++) {
                            done = (cRemainder - d * d * d * d * d == 0);
                            if (done) {
                                System.out.println("a = " + a);
                                System.out.println("b = " + b);
                                System.out.println("c = " + c);
                                System.out.println("d = " + d);
                                System.out.println("e = " + d);

                            }
                        }

                    }
                }
            }
        }
    }
}
