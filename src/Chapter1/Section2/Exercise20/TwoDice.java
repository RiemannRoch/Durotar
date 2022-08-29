package Chapter1.Section2.Exercise20;

public class TwoDice {
    public static void main(String[] args) {
        int x = 1 + (int) (6 * Math.random());
        int y = 1 + (int) (6 * Math.random());
        System.out.println(x);
        System.out.println(y);
        System.out.println(x+y);
    }
}
