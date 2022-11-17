package Chapter1.Section4.Exercise32;

public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        double p = Double.parseDouble(args[2]);

        boolean[][] isBomb = new boolean[m + 2][n + 2];

        int[][] board = new int[m + 2][n + 2];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                isBomb[i][j] = Math.random() < p;
                if (isBomb[i][j]) {
                    board[i][j] = 9;
                    board[i - 1][j]++;
                    board[i - 1][j - 1]++;
                    board[i][j - 1]++;
                    board[i + 1][j - 1]++;
                    board[i + 1][j]++;
                    board[i + 1][j + 1]++;
                    board[i][j + 1]++;
                    board[i - 1][j + 1]++;
                }
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (isBomb[i][j]) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();

        }

        System.out.println("________________");
        System.out.println();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (board[i][j] >= 9) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" " + board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
