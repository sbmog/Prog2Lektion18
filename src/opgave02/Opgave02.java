package opgave02;

import opgave02.primenumbers.PrimeNumberFinder;
import opgave02.primenumbers.SieveOfEratosthenes;
import opgave02.primenumbers.TimedPrimeNumberFinder;

public class Opgave02 {
    public static void main(String[] args) {

        PrimeNumberFinder sieve = new TimedPrimeNumberFinder(new SieveOfEratosthenes());
        sieve.findPrimeNumbers(10000000);
    }
}
