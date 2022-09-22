package Chapter1.Section4.Exercise23;

public class LongestPlateau {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int head= 0, tail=0, length = 0, maxLength = 0;

        boolean onPlateau = false;

        for (int i = 1; i < args.length; i++) {
            int m = Integer.parseInt(args[i]);
            if (m > n) {
                onPlateau = true;
                length = 1;
            }

            if (m == n && onPlateau) {
                length++;
            }

            if (m < n && onPlateau) {
                onPlateau = false;
                if (length > maxLength) {
                    maxLength = length;
                    tail = i - 1;
                    head = tail - length + 1;
                }
            }

            n = m;
        }

        if (maxLength == 0) {
            System.out.println("No plateau");
        } else {
            System.out.println("Length of the longest plateau:" + maxLength);
            System.out.println("Location of the longest plateau: from " + head + " to " + tail);
        }
    }
}
