package Chapter1.Section3.Exercise16;

public class PowersOfTwoLessThanOrEqualTo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n <= 0) {
            System.out.println("No powers of 2 less than or equal to " + n);
            return;
        }

        int i = 1;
        while (i <= n && i < Integer.MAX_VALUE/2) {
            System.out.println(i);
            i *= 2;
        }
    }
}
