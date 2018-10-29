/*
Find the Odd Integer

Given an array, find the int that appears an odd number of times.
There will always be only one integer that appears an odd number of times.
 */

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {

    public static int findIt(int[] a) {
        int result = 0;
        Map<Integer, Integer> values = new HashMap<>();
        for (int number : a) {
            values.put(number, values.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry pair : values.entrySet())
            if ((Integer)pair.getValue() % 2 != 0) {
                result = (Integer)pair.getKey();
                break;
            }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    }
}
