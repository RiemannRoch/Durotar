package Chapter1.Section2.Exercise35;

public class DragonCurves {
    public static void main(String[] args) {

        String curve = "F";
        String reverseCurve = "F";
        System.out.println("0 " + curve);

        String newCurve = curve + "L" + reverseCurve;
        String newReverseCurve = curve + "R" + reverseCurve;
        System.out.println("1 " + newCurve);

        curve = newCurve;
        reverseCurve = newReverseCurve;
        newCurve = curve + "L" + reverseCurve;
        newReverseCurve = curve + "R" + reverseCurve;
        System.out.println("2 " + newCurve);

        curve = newCurve;
        reverseCurve = newReverseCurve;
        newCurve = curve + "L" + reverseCurve;
        newReverseCurve = curve + "R" + reverseCurve;
        System.out.println("3 " + newCurve);

        curve = newCurve;
        reverseCurve = newReverseCurve;
        newCurve = curve + "L" + reverseCurve;
        newReverseCurve = curve + "R" + reverseCurve;
        System.out.println("4 " + newCurve);

        curve = newCurve;
        reverseCurve = newReverseCurve;
        newCurve = curve + "L" + reverseCurve;
        System.out.println("5 " + newCurve);
    }
}
