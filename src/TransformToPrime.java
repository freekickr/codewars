public class TransformToPrime {
    public static void main(String[] args) {
        System.out.println(minimumNumber(new int[]{50,39,49,6,17,28}));
    }

    public static int minimumNumber(int[] numbers)
    {
        int sum = 0;
        for (int n : numbers)
            sum+=n;
        if (isPrime(sum))
            return 0;
        for (int i = sum;i <= Integer.MAX_VALUE;i++) {
            if (isPrime(i)) {
                return (i - sum);
            }
        }
        return -1; // Do your magic!
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
            if (n%i == 0)
                return false;
        return true;
    }
}
