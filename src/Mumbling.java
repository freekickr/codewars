/*
Mumbling

This time no story, no theory. The examples below show you how to write function accum:

Examples:
    Accumul.accum("abcd");    // "A-Bb-Ccc-Dddd"
    Accumul.accum("RqaEzty"); // "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    Accumul.accum("cwAt");    // "C-Ww-Aaa-Tttt"
The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

public class Mumbling {

    public static String accum(String s) {
        // your code
        char[] input = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j <= i; j++)
                sb.append(j == 0 ? Character.toUpperCase(input[i]) : Character.toLowerCase(input[i]));
            if (i != input.length - 1) sb.append('-');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("abcd"));
        System.out.println(accum("RqaEzty"));
    }
}
