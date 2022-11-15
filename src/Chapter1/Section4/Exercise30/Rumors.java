package Chapter1.Section4.Exercise30;

public class Rumors {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        if (n <= 2) {
            System.out.println("Invalid input");
            return;
        }

        int countAllKnow = 0;

        int countKnowsSum = 0;

        for (int i = 0; i < trials; i++) {

            int countKnows = 0;

            boolean[] knows = new boolean[n];

            int teller = 0;

            int listener, formerTeller = 0;

            while (true) {
                knows[teller] = true;
                countKnows++;

                do {
                    listener = (int) (n * Math.random());
                } while (listener == teller || listener == formerTeller);

                if (knows[listener]) {
                    break;
                }

                formerTeller = teller;
                teller = listener;
            }

            if (countKnows == n) {
                countAllKnow++;
            }

            countKnowsSum += countKnows;
        }

        System.out.println("Ratio of times all people heard the rumor: " + (100 * countAllKnow / trials) + "%");
        System.out.println("Avg number of people to hear the rumor: " + (countKnowsSum / (trials * 1.0)));

    }
}
