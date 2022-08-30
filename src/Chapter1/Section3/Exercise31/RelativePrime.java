package Chapter1.Section3.Exercise31;

public class RelativePrime {
    public static void main(String[] args) {

        long n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int x = i;
                int y = j;
                if (x < y) {
                    int t = x;
                    x = y;
                    y = t;
                }

                int remainder;
                do {
                    remainder = x % y;
                    x = y;
                    y = remainder;
                } while (remainder > 0);
                if (x == 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }


    }
}
