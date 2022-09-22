package Chapter1.Section4.Exercise21;

public class SelfAvoidingWalk {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;
        int areaSum = 0;
        for (int t = 0; t < trials; t++) {
            boolean[][] a = new boolean[n][n];
            int x = n / 2, y = n / 2;
            int xMax = n / 2, xMin = n / 2, yMax = n / 2, yMin = n / 2;
            while (x > 0 && x < n - 1 && y > 0 && y < n - 1) {
                a[x][y] = true;
                if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) {
                    deadEnds++;
                    areaSum += (xMax - xMin) * (yMax - yMin);
                    break;
                }
                double r = Math.random();
                if
                (r < 0.25) {
                    if (!a[x + 1][y]) {
                        x++;
                        xMax = Math.max(xMax, x);
                    }
                } else if (r < 0.50) {
                    if (!a[x - 1][y]) {
                        x--;
                        xMin = Math.min(xMin, x);
                    }
                } else if (r < 0.75) {
                    if (!a[x][y + 1]) {
                        y++;
                        yMax = Math.max(yMax, y);
                    }
                } else {
                    if (!a[x][y - 1]) {
                        y--;
                        yMin = Math.min(yMin, y);
                    }
                }
            }
        }

        if (deadEnds > 0) {
            System.out.println("Avg area of dead end paths: " + areaSum/deadEnds);
        }
        System.out.println(100 * deadEnds / trials + "% dead ends");
    }
}
