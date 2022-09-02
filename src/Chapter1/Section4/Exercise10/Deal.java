package Chapter1.Section4.Exercise10;

public class Deal {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n > 52 / 5 || n < 0) {
            System.out.println("Invalid number of hands");
            return;
        }

        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[RANKS.length * SUITS.length];
        for (int i = 0; i < RANKS.length; i++)
            for (int j = 0; j < SUITS.length; j++)
                deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];

        int m = deck.length;

        for (int i = 0; i < m; i++) {
            int r = i + (int) ((m - i) * Math.random());
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(deck[5 * i + j] + ",\t ");
            }
            System.out.println("\n");
        }
    }
}
