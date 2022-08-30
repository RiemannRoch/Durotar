package Chapter1.Section3.Exercise23;

public class GamblerTwoFor {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < trials; t++) { // Run one experiment.

            for (int cash = stake; cash > 0; ) { // Simulate one bet.
                bets++;
                if (Math.random() < 0.5) cash++;
                else cash--;
                if (cash == goal) {
                    wins++;
                    break;
                }
            } // Cash is either 0 (ruin) or $goal (win).
        }
        System.out.println(100 * wins / trials + "% wins");
        System.out.println("Avg # bets: " + bets / trials);
    }
}
