package Chapter1.Section3.Exercise26;

public class BoundedGambler {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int maxBets = Integer.parseInt(args[3]);
        int sumBets = 0;
        int sumCash = 0;
        int wins = 0;
        int outOfTime =0;
        for (int t = 0; t < trials; t++)
        { // Run one experiment.
            int bets = 0;
            int cash = stake;
            while (cash > 0 && cash < goal && bets < maxBets)
            { // Simulate one bet.
                bets++;
                if (Math.random() < 0.5) cash++;
                else
                    cash--;
            } // Cash is either 0 (ruin) or $goal (win).
            if (cash == goal) wins++;
            else if (bets == maxBets) outOfTime++;
            sumBets += bets;
            sumCash += cash;
        }
        System.out.println(100*wins/trials + "% wins");
        System.out.println(100*outOfTime/trials + "% timeouts");
        System.out.println("Avg # bets: " + sumBets/trials);
        System.out.println("Avg final cash: " + sumCash/trials);

    }
}
