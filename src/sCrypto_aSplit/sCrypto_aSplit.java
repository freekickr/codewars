package sCrypto_aSplit;

import java.util.ArrayList;
import java.util.List;

//        For building the encrypted string:
//        Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.
//        Do this n times!

//        For both methods:
//        If the input-string is null or empty return exactly this value!
//        If n is <= 0 then return the input text.

public class sCrypto_aSplit {

    public static String encrypt(final String text, final int n) {
        // Your code here
        if (text.isEmpty() || text == null || n <= 0)
            return text;

        List<Character> even = new ArrayList<>();
        List <Character> odd = new ArrayList<>();

        String textLine = text;

        for (int a = 0; a < n; a++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < textLine.length(); i++) {
                if (i % 2 == 0)
                    even.add(textLine.charAt(i));
                else
                    odd.add(textLine.charAt(i));
            }
            odd.addAll(even);
            for (Character c : odd)
                stringBuilder.append(c);
            textLine = stringBuilder.toString();
            odd.clear();
            even.clear();
        }

        System.out.println(textLine);
        return textLine;
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        //
        return null;
    }

    public static void main(String[] args) {
        encrypt("This is a test!", 2);
    }
}
