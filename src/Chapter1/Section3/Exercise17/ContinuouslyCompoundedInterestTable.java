package Chapter1.Section3.Exercise17;

public class ContinuouslyCompoundedInterestTable {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);

        for (int t = 0; t< 26; t++) {
            System.out.print("After "+ t + "years: \t");
            System.out.println(P * Math.exp(r * t));
        }
    }
}
