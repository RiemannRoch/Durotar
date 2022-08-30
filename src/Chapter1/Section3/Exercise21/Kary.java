package Chapter1.Section3.Exercise21;

public class Kary {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);

        if (k < 2 || k > 16) {
            System.out.println("Base out of range.");
            return;
        }

        System.out.print(i + " in base " + k + ": ");

        long power = 1;
        while (power <= i / k)
            power *= k;
        while (power > 0) {
            int d = (int) (i / power);
            switch (d) {
                case 15:
                    System.out.print("F");
                    break;
                case 14:
                    System.out.print("E");
                    break;
                case 13:
                    System.out.print("D");
                    break;
                case 12:
                    System.out.print("C");
                    break;
                case 11:
                    System.out.print("B");
                    break;
                case 10:
                    System.out.print("A");
                    break;
                default:
                    System.out.print(d);
            }
            i -= d * power;
            power /= k;
        }
        System.out.println();
    }
}
