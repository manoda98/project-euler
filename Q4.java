public class Q4 {
    public static void main (String [] args) {
        int n = 3;
        System.out.print(largestPalindrome(n));
    }
    public static int largestPalindrome(int n) {
        int upperLimit = (int)Math.pow(10, n) - 1;

        int lowerLimit = 1 + upperLimit / 10;

        int maxProduct = 0;

        for (int i = upperLimit; i >= lowerLimit; i--) {

            for (int j = i; j >= lowerLimit; j--) {

                int product = i * j;
                if (product < maxProduct)
                    break;
                int number = product;
                int reverse = 0;

                while (number != 0) {
                    reverse = reverse * 10 + number % 10;
                    number = number / 10;
                }

                if (product == reverse && product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        return maxProduct;
    }
}
