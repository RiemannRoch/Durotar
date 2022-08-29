package Chapter1.Section2.Exercise34;

public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(Math.min(a, Math.min(b, c)));

        System.out.println(Math.max(Math.max(Math.min(a, b), Math.min(b, c)), Math.min(a, c)));

        System.out.println(Math.max(a, Math.max(b, c)));
    }
}
