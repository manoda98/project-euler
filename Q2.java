public class Q2 {
    public static void main(String [] args) {
        int x = 1;
        int y = 2;
        int sum = 2;
        int limit = 4000000;
        int nextTerm = 0;

        while(nextTerm <= limit) {
            nextTerm = x + y;
            if(nextTerm % 2 == 0 && nextTerm <= limit) {
                sum = sum + nextTerm;
            }
            x = y;
            y = nextTerm;
        }
        System.out.println("sum of even value : " + sum);
    }
}
