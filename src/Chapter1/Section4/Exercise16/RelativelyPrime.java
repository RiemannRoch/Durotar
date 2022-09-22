package Chapter1.Section4.Exercise16;

public class RelativelyPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[][] isRelativelyPrime = new boolean[n][n];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                int x = i;
                int y = j;
                while (x % y != 0) {
                    int temp = y;
                    y = x % y;
                    x = temp;
                }
                if (y == 1) {
                    isRelativelyPrime[i][j] = true;
                    isRelativelyPrime[j][i] = true;
                }
            }
        }

        System.out.print("  \t");
        for (int j = 1; j < n; j++) {
            if (j < 10) {
                System.out.print(j + "  ");
            } else {
                System.out.print(j + " ");
            }
        }
        System.out.println();


        for (int i = 1; i < n; i++) {
            System.out.print(i + ":\t");
            for (int j = 1; j < n; j++) {
                if(isRelativelyPrime[i][j]) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
