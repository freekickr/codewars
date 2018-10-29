/*
Shortest Word

Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
 */

import java.util.Arrays;
import java.util.Comparator;

public class ShortestWord {

    public static int findShort(String s) {
        String[] words = s.split(" ");
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        Arrays.sort(words, comparator);
        return words[0].length();
    }

    public static int findShort2(String s) {
        String[] words = s.split(" ");
        int min = words[0].length();
        for (int i = 1; i < words.length; i++)
            if (words[i].length() < min)
                min = words[i].length();
        return min;
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
    }
}
