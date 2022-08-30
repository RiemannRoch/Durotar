package Chapter1.Section3.Exercise37;

public class RandomWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int x, y;
        long steps = 0;

        for (int i = 0; i < trials; i++) {
            x = 0;
            y = 0;
            while (Math.max(Math.abs(x), Math.abs(y)) < n) {
                steps++;
                int d = (int) (4 * Math.random());
                switch (d) {
                    case 0:
                        x++;
                        break;
                    case 1:
                        y--;
                        break;
                    case 2:
                        x--;
                        break;
                    case 3:
                        y++;
                }
            }
        }
        System.out.println("Avg # steps: " +  steps / trials);
    }
}
