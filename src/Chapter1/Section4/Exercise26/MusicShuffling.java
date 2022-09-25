package Chapter1.Section4.Exercise26;

public class MusicShuffling {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int counter = 0;

        int[] a = new int[n];
        for (int j = 0; j < trials; j++) {
            for (int i = 0; i < n; i++) {
                a[i] = i;
            }
            for (int i = 0; i < n; i++) {
                int k = i + (int) ((n - i) * Math.random());
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1] + 1) {
                    counter++;
                    break;
                }
            }
        }

        System.out.println("Rate of shuffles with no sequential pairs: " + (100 * (trials - counter) / trials) + "%");
    }
}
