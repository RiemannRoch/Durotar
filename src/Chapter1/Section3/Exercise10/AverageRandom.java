package Chapter1.Section3.Exercise10;

public class AverageRandom {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            double random = Math.random();
            System.out.println(i + ": " + random);
            sum += random;
        }
        System.out.println("Average: " + sum / n);
    }
}
