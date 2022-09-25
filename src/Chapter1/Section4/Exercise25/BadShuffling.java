package Chapter1.Section4.Exercise25;

public class BadShuffling {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[][] table = new int[m][m];

        int[] a = new int[m];


        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                a[i] = i;
            }
            for (int i = 0; i < m; i++) {
                int k = (int) (m * Math.random());
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
            for (int i = 0; i < m; i++) {
                table[a[i]][i]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
