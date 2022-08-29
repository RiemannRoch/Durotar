package Chapter1.Section2.Exercise27;

public class RandomGaussian {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();

        System.out.println(Math.sin(2 * Math.PI * v) * Math.sqrt(-2 * Math.log(u)));
    }
}
