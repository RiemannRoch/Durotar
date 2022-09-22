package Chapter1.Section4.Exercise20;

public class SelfAvoidingWalk {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;
        int totalLengthOfEscapePaths = 0;
        int totalLengthOfDeadEndPaths = 0;
        for (int t = 0; t < trials; t++) {
            boolean[][] a = new boolean[n][n];
            int x = n / 2, y = n / 2;
            int length = 0;
            boolean deadEnd = false;
            while (x > 0 && x < n - 1 && y > 0 && y < n - 1) {
                length++;
                a[x][y] = true;
                if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) {
                    deadEnd = true;
                    deadEnds++;
                    totalLengthOfDeadEndPaths += length;
                    break;
                }
                double r = Math.random();
                if
                (r < 0.25) {
                    if (!a[x + 1][y]) x++;
                } else if (r < 0.50) {
                    if (!a[x - 1][y]) x--;
                } else if (r < 0.75) {
                    if (!a[x][y + 1]) y++;
                } else {
                    if (!a[x][y - 1]) y--;
                }
            }
            if (!deadEnd) {
                totalLengthOfEscapePaths += length;
            }
        }

        if (deadEnds > 0) {
            System.out.println("Avg length of dead end paths: " + totalLengthOfDeadEndPaths / deadEnds);
        } else {
            System.out.println("No dead ends");
        }

        if (trials - deadEnds > 0) {
            System.out.println("Avg length of escape paths: " + totalLengthOfEscapePaths / (trials - deadEnds));
        } else {
            System.out.println("No escape");
        }
        System.out.println(100 * deadEnds / trials + "% dead ends");
    }
}
