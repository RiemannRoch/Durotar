package Chapter1.Section3.Exercise08;

import javax.naming.PartialResultException;

public class Hellos {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        String suffix;

        for (int i = 1; i <= n; i++) {
            if ((i % 100) / 10 != 1) {
                switch (i % 10) {
                    case 1:
                        suffix = "st";
                        break;
                    case 2:
                        suffix = "nd";
                        break;
                    case 3:
                        suffix = "rd";
                        break;
                    default:
                        suffix = "th";
                }
            } else {
                suffix = "th";
            }
            System.out.println(i + suffix + " Hello");
        }
    }
}
