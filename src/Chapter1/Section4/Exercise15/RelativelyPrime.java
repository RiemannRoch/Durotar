package Chapter1.Section4.Exercise15;

public class RelativelyPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[][] isRelativelyPrime = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                int x = i;
                int y = j;
                if (j == 0 ) {
                    isRelativelyPrime[i][j] = false;
                    continue;
                }
                while (x % y != 0) {
                    int temp = y;
                    y = x % y;
                    x = temp;
                }
            }
        }
    }
}
