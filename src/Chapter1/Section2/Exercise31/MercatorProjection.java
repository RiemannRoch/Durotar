package Chapter1.Section2.Exercise31;

public class MercatorProjection {
    public static void main(String[] args) {
        double center = Double.parseDouble(args[0]);
        double lat = Double.parseDouble(args[1]);
        double lon = Double.parseDouble(args[2]);

        System.out.println("x = " + (lat - center));

        double s = Math.sin(lon);
        System.out.println("y = " + (0.5 * Math.log((1 + s) / (1 - s))));
    }
}
