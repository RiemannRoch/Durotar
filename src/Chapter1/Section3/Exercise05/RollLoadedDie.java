package Chapter1.Section3.Exercise05;

public class RollLoadedDie {
    public static void main(String[] args) {

        int a = 1 + (int) (8 * Math.random());

        System.out.println(Math.min(a, 6));

    }
}
