package Chapter1.Section4.Exercise27;

/*
* m = 1000000
*
* n=5, avg = 2.283
* n=10, avg = 2.928 (+.645)
* n=15, avg = 3.317 (+.389)
* n=20, avg = 3.596 (+.279)
* n=25, avg = 3.819 (+.223)
*
* n=8, avg = 2.718
* n=16, avg = 3.381 (+.663)
* n=32, avg = 4.055 (+.674)
* n=64, avg = 4.744 (+.689)
*
*
* n=13, avg = 3.181 (+.463)
* n=21, avg = 3.647 (+.466)
* n=34, avg = 4.118 (+.471)
* n=17656, avg = 10.355
*
* Conjecture: avg = k*log_phi(n)
* */

public class AverageMinimaInPermutations {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        int minCount = 0;
        for (int j = 0; j < m; j++) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = i;
            }

            int min = n;

            for (int i = 0; i < n; i++) {
                int k = i + (int) ((n - i) * Math.random());
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
                if (a[i] < min) {
                    min =  a[i];
                    minCount++;
                }
            }
        }
        System.out.println("Average number of minima in " + m + " random permutations of length " + n + " is: " + minCount/(1.0*m));

    }
}
