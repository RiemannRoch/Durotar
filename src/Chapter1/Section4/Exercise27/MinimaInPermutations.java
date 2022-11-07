package Chapter1.Section4.Exercise27;

public class MinimaInPermutations {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i;
        }

        int min = n;
        int minCount = 0;

        for (int i = 0; i < n; i++) {
            int k = i + (int) ((n - i) * Math.random());
            int temp = a[k];
            a[k] = a[i];
            a[i] = temp;
            if (a[i] < min) {
                min = a[i];
                minCount++;
            }
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Left-to-right minima: " + minCount);

    }
}
