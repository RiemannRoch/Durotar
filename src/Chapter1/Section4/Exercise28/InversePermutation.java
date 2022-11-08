package Chapter1.Section4.Exercise28;

public class InversePermutation {
    public static void main(String[] args) {

        int n = args.length;

        int[] a = new int[n];

        int[] b = new int[n];

        boolean[] check = new boolean[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
            if (a[i] > n - 1) {
                System.out.println("Invalid entry");
                return;
            }
            if (!check[a[i]]) {
                check[a[i]] = true;
            } else {
                System.out.println("Duplicate entry: not a permutation");
                return;
            }
            b[a[i]] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }


    }
}
