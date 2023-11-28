public class Q2 {
    public static void main(String [] args) {
        int a = 1;
        int b = 2;
        int sum = 2;
        int limit = 4000000;
        int nextTerm = 0;

        while(nextTerm <= limit) {
            nextTerm = a + b;
            if(nextTerm % 2 == 0 && nextTerm <= limit) {
                sum = sum + nextTerm;
            }
            a = b;
            b = nextTerm;
        }
        System.out.println("sum of even value : " + sum);
    }
}
