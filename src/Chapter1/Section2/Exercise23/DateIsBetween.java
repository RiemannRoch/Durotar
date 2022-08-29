package Chapter1.Section2.Exercise23;

public class DateIsBetween {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);

        System.out.println((m == 3 && d >= 20) || (m >= 4 && m <= 5) || (m == 6 && d <= 20));
    }
}
