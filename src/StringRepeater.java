/*
Write a class function named repeat() that takes two arguments (a string and a long integer),
and returns a new string where the input string is repeated that many times. For example:

Repeater.repeat("a", 5) should return "aaaaa"
 */

import java.util.Collections;

public class StringRepeater {

    public static String repeat(String string,long n){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++)
            result.append(string);
        return result.toString();
    }

    public static String repeat2(String string,long n){
        return String.join("", Collections.nCopies((int) n, string));
    }

    public static void main(String[] args) {
        System.out.println(repeat2("a", 5));
    }
}
