package Chapter1.Section3.Exercise39;

public class Cos {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);

        double term = 1.0;
        double sum = 0.0;
        for (int n = 1; sum != sum + term; n++) {
            sum += term;
            term *= -x * x / (2 * n * (2 * n - 1));
        }

        System.out.println(sum);
    }
}
