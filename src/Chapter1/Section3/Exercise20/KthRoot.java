package Chapter1.Section3.Exercise20;

public class KthRoot {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        double EPSILON = 1e-15;
        double t = n;
        while (Math.abs(t - n / Math.pow(t, k-1)) > EPSILON * t) {
            t = (n / Math.pow(t, k - 1) + (k - 1) * t) / k;
            System.out.println(t);
        }
    }
}
