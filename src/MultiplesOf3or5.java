/*
Multiples of 3 or 5

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

Note: If the number is a multiple of both 3 and 5, only count it once.
 */

public class MultiplesOf3or5 {

    public static int solution(int number) {
        int result = 0;
        for (int i = 0; i < number; i++)
            if (i % 3 == 0 || i % 5 == 0)
                result += i;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(getMiddle("qwert"));
    }

    public static String getMiddle(String word) {
        //Code goes here!
        return word.length() % 2 == 0 ? String.valueOf(word.charAt((word.length() / 2) - 1))+String.valueOf(word.charAt((word.length() / 2))): String.valueOf(word.charAt(word.length() / 2));
    }
}
