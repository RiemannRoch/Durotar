package Chapter1.Section2.Exercise14;

public class EvenlyDivide {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a % b == 0 || b % a == 0);
    }
}
