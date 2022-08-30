package Chapter1.Section3.Exercise35;

public class IsbnChecksum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n > 999999999) {
            System.out.println("Input out of range");
            return;
        }

        int sum = 0;

        for (int i = 2; i < 11; i++) {
            sum += i * (n % 10);
            n /= 10;
        }

        int digit = (11 - sum % 11) % 11;

        System.out.println(digit);
    }
}
