package Chapter1.Section4.Exercise31;

// This program takes aprox 14s to execute with n = 10^9
public class PrimeSieve {

    public static void main( String[] args ) {

        int n = Integer.parseInt( args[ 0 ] );
        boolean[] isPrime = new boolean[ n + 1 ];
        for ( int i = 2; i <= n; i++ )
            isPrime[ i ] = true;

        for ( int i = 2; i <= n / i; i++ ) {
            if ( isPrime[ i ] ) { // Mark multiples of i as nonprime.
                for ( int j = i; j <= n / i; j++ )
                    isPrime[ i * j ] = false;
            }
        }
        // Count the primes.
        int primes = 0;
        for ( int i = 2; i <= n; i++ )
            if ( isPrime[ i ] )
                primes++;
        System.out.println( primes );
    }

}
