package Chapter1.Section3.Exercise12;

public class FunctionGrowth {
    public static void main(String[] args) {

        System.out.print("log n \t\t\t\t");
        System.out.print("n \t\t");
        System.out.print("n log n \t\t\t");
        System.out.print("n^2 \t\t");
        System.out.print("n^3 \t\t\t");
        System.out.println("2^n \t");

        for (int i = 16; i < 2049; i *= 2) {
            System.out.print(Math.log(i) + "\t");
            System.out.print(i + "\t");
            if (i < 1000) System.out.print("\t");
            System.out.print(i * Math.log(i) + "\t");
            System.out.print(i * i + "\t\t");
            if (i < 32) System.out.print("\t");
            System.out.print(Math.pow(i, 3) + "\t");
            if (i < 64) System.out.print("\t");
            if (i < 512) System.out.print("\t");
            System.out.println(Math.pow(2, i));
        }
    }
}
