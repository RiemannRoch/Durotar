package Chapter1.Section4.Exercise33;

public class FindDuplicate {
    public static void main(String[] args) {
        int n = args.length;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
            if (a[i] >= n) {
                System.out.println("Invalid input");
                return;
            }
        }

        for (int i = 0; i < n; i++) {
            while (a[i] != i) {
                if (a[a[i]] == a[i]) {
                    System.out.println("There is a duplicate");
                    return;
                } else {
                    int temp = a[a[i]];
                    a[a[i]] = a[i];
                    a[i] = temp;
                }
            }
        }

        System.out.println("There is not a duplicate");
    }
}
