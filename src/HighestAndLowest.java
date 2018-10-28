/*
Highest And Lowest

In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:
    HighAndLow("1 2 3 4 5") // return "5 1"
    HighAndLow("1 2 -3 4 5") // return "5 -3"
    HighAndLow("1 9 3 4 -5") // return "9 -5"

Notes:
    All numbers are valid Int32, no need to validate them.
    There will always be at least one number in the input string.
    Output string must be two numbers separated by a single space, and highest number is first.
 */

import java.util.Arrays;

public class HighestAndLowest {

    public static String HighAndLow(String numbers) {
        String[] nums = numbers.split("\\s");
        int min = Integer.parseInt(nums[0]);
        int max = Integer.parseInt(nums[0]);
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, Integer.parseInt(nums[i]));
            max = Math.max(max, Integer.parseInt(nums[i]));
        }
        return max + " " + min;
    }

    public static String HighAndLow2(String numbers) {
        String[] strNums = numbers.split("\\s");
        int[] intNums = new int[strNums.length];
        for (int i = 0; i < strNums.length; i++) {
            intNums[i] = Integer.parseInt(strNums[i]);
        }
        Arrays.sort(intNums);
        return intNums[intNums.length-1] + " " + intNums[0];
    }

    public static void main(String[] args) {
        System.out.println(HighAndLow("1 2 3 4 5"));
        System.out.println(HighAndLow("1 2 -3 4 5"));
        System.out.println(HighAndLow("1 9 3 4 -5"));
    }
}
