package Chapter1.Section3.Exercise02;

public class Quadratic {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a == 0.0) {
            if (b == 0.0) {
                if (c == 0.0) {
                    System.out.println("Zero polynomial");
                } else {
                    System.out.println("Constant non-zero polynomial: no real roots");
                }
            } else {
                System.out.println("Affine equation");
                System.out.println("x = " + (-c / b));
            }
        } else {
            System.out.println("Quadratic equation");
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Negative discriminant: no real roots");
            } else {
                System.out.println("Non-negative discriminant. Real roots:");
                System.out.println("x' = " + ((-b + Math.sqrt(delta)) / (2 * a)));
                System.out.println("x'' = " + ((-b - Math.sqrt(delta)) / (2 * a)));
            }
        }
    }
}
