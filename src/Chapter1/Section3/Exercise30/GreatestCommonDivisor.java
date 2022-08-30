package Chapter1.Section3.Exercise30;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        long x = Long.parseLong(args[0]);
        long y = Long.parseLong(args[1]);

        System.out.print("The mdc of " + x + " and " + y + " is ");

        if (x < y) {
            long t = x;
            x = y;
            y = t;
        }

        long remainder;
        do {
            remainder = x % y;
            x = y;
            y = remainder;
        } while (remainder > 0);

        System.out.println(x);

    }
}
