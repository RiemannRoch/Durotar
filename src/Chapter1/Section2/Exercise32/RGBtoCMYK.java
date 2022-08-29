package Chapter1.Section2.Exercise32;

public class RGBtoCMYK {
    public static void main(String[] args) {
        double r = Integer.parseInt(args[0]) / 255.0;
        double g = Integer.parseInt(args[1]) / 255.0;
        double b = Integer.parseInt(args[2]) / 255.0;

        double w = Math.max(r, Math.max(g, b));
        System.out.println("c = " + (w - r) / w);
        System.out.println("m = " + (w - g) / w);
        System.out.println("y = " + (w - b) / w);
        System.out.println("k = " + (1 - w));
    }
}
