package Chapter1.Section3.Exercise41;

/**
 * trials: 100000
 * eventOne/eventTwo: 1.074426494345719
 * eventOne is more likely
 */
public class PepysProblem {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);

        int eventOneCounter = 0, eventTwoCounter = 0;

        for (int i = 0; i < trials; i++) {

            for (int j = 0; j < 6; j++) {
                if (Math.random() < 1.0 / 6) {
                    eventOneCounter++;
                    break;
                }
            }

            boolean gotOneOnce = false;

            for (int j = 0; j < 12; j++) {
                if (Math.random() < 1.0 / 6) {
                    if (gotOneOnce) {
                        eventTwoCounter++;
                        break;
                    } else {
                        gotOneOnce = true;
                    }
                }
            }
        }

        System.out.println("trials: " + trials);
        System.out.println("eventOne/eventTwo: " + (1.0 * eventOneCounter) / eventTwoCounter);
    }
}
