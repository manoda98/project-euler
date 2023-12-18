public class Q3 {

    public static void main(String[] args) {
        long number = 600851475143L;

        long largestPrimeFactor = findLargestPrimeFactor(number);

        System.out.println(largestPrimeFactor);
    }

    public static long findLargestPrimeFactor(long n) {
        long maxPrime = -1;

        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }

        if (n > 2) {
            maxPrime = n;
        }

        return maxPrime;
    }
}
