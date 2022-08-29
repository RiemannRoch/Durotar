package Chapter1.Section2.Exercise19;

public class RandomInteger {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        //Assuming that b > a
        System.out.println(a + Math.floor(Math.random()*(b+1-a)));
    }
}
