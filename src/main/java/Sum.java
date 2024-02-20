public class Sum {
    public static void main(String[] args) {
        int n1 = 8;
        int n2 = 29;
        System.out.println("Sum of all numbers between " + n1 + " and " + n2 + " that are multiples of 7 = " + sumMultiples(n1,n2));
    }
    public static int sumMultiples(int n1, int n2) {
        if (n1>n2) { // stops the recursion when n1 is greater than n2
            return 0;
        }
        if (n1 % 7 == 0) { // gets the multiple of 7
            return n1 + sumMultiples(n1 + 7, n2);
        } else { // if it's not a multiple of 7, goes to the next number
            return sumMultiples(n1 + 1, n2);
        }
    }
}
