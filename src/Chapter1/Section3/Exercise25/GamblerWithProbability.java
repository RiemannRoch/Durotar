package Chapter1.Section3.Exercise25;

public class GamblerWithProbability {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        double prob = Double.parseDouble(args[3]);
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < trials; t++)
        { // Run one experiment.
            int cash = stake;
            while (cash > 0 && cash < goal)
            { // Simulate one bet.
                bets++;
                if (Math.random() < prob) cash++;
                else
                    cash--;
            } // Cash is either 0 (ruin) or $goal (win).
            if (cash == goal) wins++;
        }
        System.out.println(100*wins/trials + "% wins");
        System.out.println("Avg # bets: " + bets/trials);
    }
}
