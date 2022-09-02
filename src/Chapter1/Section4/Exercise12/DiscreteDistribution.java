package Chapter1.Section4.Exercise12;

public class DiscreteDistribution {
    public static void main(String[] args) {

        int n = args.length;

        int[] limiters = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            limiters[i] = limiters[i - 1] + Integer.parseInt(args[i - 1]);
        }

        int number = (int) (limiters[n] * Math.random());

        int part = 0;
        while (number >= limiters[part+1]) part++;

        System.out.println(part);
    }
}
