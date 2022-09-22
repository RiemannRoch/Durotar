package Chapter1.Section4.Exercise22;

/**
 * Apparently 600_000 dice throws are enough to match the real probabilities to three decimal places.
 * */

public class DiceSimulation {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int[] frequencies = new int[13];
        for (int i = 1; i <= 6; i++)
            for (int j = 1; j <= 6; j++)
                frequencies[i + j]++;
        double[] probabilities = new double[13];
        for (int k = 1; k <= 12; k++)
            probabilities[k] = frequencies[k] / 36.0;

        int[] experimentalFrequencies = new int[13];
        for (int i = 0; i < n; i++) {
            int result = 2 + (int) (6 * Math.random()) + (int) (6 * Math.random());
            experimentalFrequencies[result]++;
        }
        double[] experimentalProbabilities = new double[13];
        for (int k = 1; k <= 12; k++) {
            experimentalProbabilities[k] = experimentalFrequencies[k] / (n * 1.0);
        }

        double distance = 0;
        for (int k = 1; k <= 12; k++) {
            distance = Math.max(distance, Math.abs(probabilities[k] - experimentalProbabilities[k]));
        }

        System.out.println("distance: " + distance);
        System.out.println("Matches to three decimal places? " + (distance < 0.001));

    }
}
