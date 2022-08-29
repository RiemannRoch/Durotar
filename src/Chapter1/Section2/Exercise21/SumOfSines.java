package Chapter1.Section2.Exercise21;

public class SumOfSines {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        System.out.println(Math.sin(2 * t) + Math.sin(3 * t));
    }
}
