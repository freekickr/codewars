/*
Count of positives / sum of negatives

Given an array of integers.
Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
If the input array is empty or null, return an empty array.

Example
    For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
 */

public class CountOfPositiveNegativeInt {

    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0) return new int[0];
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < input.length; i++)
            if (input[i] <= 0)
                neg += input[i];
            else
                pos++;

        return new int[] {pos, neg}; //return an array with count of positives and sum of negatives
    }

    public static void main(String[] args) {
        int[] result = countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15});
        for (int i : result)
            System.out.print(i + " ");
    }
}
