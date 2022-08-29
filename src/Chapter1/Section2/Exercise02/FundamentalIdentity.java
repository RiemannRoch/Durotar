package Chapter1.Section2.Exercise02;

/**
 * The values are not exactly 1 because of precision
 * */
public class FundamentalIdentity {

        public static void main( String[] args ) {
                double theta = Double.parseDouble( args[0] );
                System.out.println(Math.cos( theta )*Math.cos(theta) +Math.sin( theta )*Math.sin( theta ));
        }

}
