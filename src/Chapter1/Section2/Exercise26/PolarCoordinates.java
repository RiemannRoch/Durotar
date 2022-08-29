package Chapter1.Section2.Exercise26;

public class PolarCoordinates {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        System.out.println("r = " + Math.sqrt(x * x + y * y));
        System.out.println("\u03b8 = " + Math.atan2(y, x));
    }
}
