package TransformToPrime;

/*
Task :
Given a List [] of n integers , find minimum mumber to be inserted in a list, so that sum of all elements of list should equal the closest prime number .

Notes
List size is at least 2 .
List's numbers will only positives (n > 0) .
Repeatition of numbers in the list could occur .
The newer list's sum should equal the closest prime number .

minimumNumber ({3,1,2}) ==> return (1)
minimumNumber ({2,12,8,4,6}) ==> return (5)
minimumNumber ({50,39,49,6,17,28}) ==> return (2)
*/

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
