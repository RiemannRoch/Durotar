package Chapter1.Section4.Exercise29;

public class HadamardMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[][] H = new boolean[n+1][n+1];
        boolean[][] G = new boolean[n+1][n+1];


        H[1][1] = true;

        for (int i = 2; i <= n; i*=2) {
            for (int j = 1; j <= i / 2; j++) {
                for (int l = 1; l <= i / 2; l++) {
                    G[j][l] = H[j][l];
                    G[i / 2 + j][l] = H[j][l];
                    G[j][i / 2 + l] = H[j][l];
                    G[i/2 + j][i/2 + l] = !H[j][l];
                }
            }
            boolean[][] temp = H;
            H = G;
            G = temp;
        }

        for(int i = 1; i< n+1; i++) {
            for (int j = 1; j< n+1; j++) {
                if (H[i][j]) System.out.print("T  ");
                else System.out.print("F  ");
            }
            System.out.println();
        }
    }
}
