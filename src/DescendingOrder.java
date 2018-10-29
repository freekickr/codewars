/*
Descending Order

Your task is to make a function that can take any non-negative integer as a argument and return it with its digits in descending order.
Essentially, rearrange the digits to create the highest possible number.

Examples:
    Input: 21445 Output: 54421
    Input: 145263 Output: 654321
    Input: 1254859723 Output: 9875543221
 */


import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(21445));
        System.out.println(sortDesc(145263));
        System.out.println(sortDesc(1254859723));
    }
}
