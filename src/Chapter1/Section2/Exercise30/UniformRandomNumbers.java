package Chapter1.Section2.Exercise30;

public class UniformRandomNumbers {
    public static void main(String[] args) {

        double a, b, c, d, e, max, min;

        System.out.println("a = " + (a = Math.random()));
        min = a;
        max = a;
        System.out.println("b = " + (b = Math.random()));
        min = Math.min(min, b);
        max = Math.max(max, b);
        System.out.println("c = " + (c = Math.random()));
        min = Math.min(min, c);
        max = Math.max(max, c);
        System.out.println("d = " + (d = Math.random()));
        min = Math.min(min, d);
        max = Math.max(max, d);
        System.out.println("e = " + (e = Math.random()));
        min = Math.min(min, e);
        max = Math.max(max, e);

        System.out.println("avg = " + (a + b + c + d + e) / 5);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
