package Chapter1.Section3.Exercise43;

public class MedianOfFive {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }

        if (c > d) {
            t = c;
            c = d;
            d = t;
        }

        c = Math.max(a, c);

        if (c > d) {
            t = c;
            c = d;
            d = t;
        }

        if (b > e) {
            t = b;
            b = e;
            e = t;
        }

        d = Math.min(d, e);

        c = Math.max(b, c);

        System.out.println(Math.min(c, d));
    }
}
