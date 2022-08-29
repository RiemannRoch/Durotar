package Chapter1.Section2.Exercise24;

public class ContinuouslyCompoundedInterest {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        double P = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        System.out.println(P * Math.exp(r * t));
    }
}
