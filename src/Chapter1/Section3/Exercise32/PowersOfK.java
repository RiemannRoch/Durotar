package Chapter1.Section3.Exercise32;

public class PowersOfK {
    public static void main(String[] args) {

        long k = Long.parseLong(args[0]);

        if ( k < 2 ) {
            System.out.println("Invalid input");
            return;
        }

        long max = Long.MAX_VALUE / k;

        int exp = 0;
        long power = 1L;
        System.out.println(exp + ": " + power);
        while (power <= max) {
            exp++;
            power *= k;
            System.out.println(exp + ": " + power);
        }
    }
}
