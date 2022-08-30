package Chapter1.Section3.Exercise24;

public class GamblerPlot {
    public static void main(String[] args) {
        int cash = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int bets = 0;
        while (cash > 0 && cash < goal) { // Simulate one bet.
            bets++;
            if (Math.random() < 0.5) cash++;
            else
                cash--;

            for (int i = 0; i< cash; i++) {
                System.out.print("*");
            }
            System.out.println();
        } // Cash is either 0 (ruin) or $goal (win).
        if (cash == goal) System.out.print("YOU WIN! ");
        else System.out.print("You lose :( ");
        System.out.println("Bets: " + bets);
    }
}
