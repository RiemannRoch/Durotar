package Chapter1.Section3.Exercise42;

public class MonteHall {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int winsSwitching = 0, winsNotSwitching = 0;

        for (int i = 0; i < n; i++) {
            int door = (int) (3 * Math.random());
            if (door != 0) {
                winsSwitching++;
            }
        }

        for (int i = 0; i < n; i++) {
            int door = (int) (3 * Math.random());
            if (door == 0) {
                winsNotSwitching++;
            }
        }

        System.out.println("Switching: " + 100 * winsSwitching / n + "%");
        System.out.println("Not switching: " + 100 * winsNotSwitching / n + "%");
    }
}
