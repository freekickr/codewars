import java.util.ArrayList;
import java.util.List;

//        Simple Encryption #1 - Alternating Split

//        For building the encrypted string:
//        Take every 2nd char from the string, then the other chars, that are not every 2nd char, and concat them as new String.
//        Do this n times!

//        For both methods:
//        If the input-string is null or empty return exactly this value!
//        If n is <= 0 then return the input text.

//        Examples:
//        "This is a test!", 1 -> "hsi  etTi sats!"
//        "This is a test!", 2 -> "hsi  etTi sats!" -> "s eT ashi tist!"

//        ПЕРЕДЕЛАТЬ ЧЕРЕЗ STRINGBUILDER (УБРАТЬ ВСЕ LIST'Ы)!!!! Код сократится в два раза (минимум)

public class SimpleEncryption_I {

    private static boolean checkInput(String text, int n) {
        if (text != null && !text.isEmpty() && n > 0)
            return true;
        else
            return false;
    }

    public static String encrypt(final String text, final int n) {
        // Your code here
        if (!checkInput(text, n))
            return text;

        List<Character> even = new ArrayList<>();
        List <Character> odd = new ArrayList<>();

        String textLine = text;
        StringBuilder stringBuilder = null;

        for (int a = 0; a < n; a++) {
            stringBuilder = new StringBuilder();
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
        return textLine;
    }

    public static String decrypt(final String encryptedText, final int n) {
        // Your code here
        if (!checkInput(encryptedText, n))
            return encryptedText;

        List<Character> line = new ArrayList<>();
        for (Character c : encryptedText.toCharArray())
            line.add(c);

        List<Character> even = new ArrayList<>();
        List <Character> odd = new ArrayList<>();

        StringBuilder stringBuilder = null;
        for (int a = 0; a < n; a++) {
            stringBuilder = new StringBuilder();
            for (int i = 0; i < encryptedText.length(); i++) {
                if (i < line.size()/2)
                    even.add(line.get(i));
                else
                    odd.add(line.get(i));
            }
            line.clear();
            int x = 0, y = 0;
            for (int i = 0; i < encryptedText.length(); i++) {
                if (i % 2 == 0) {
                    line.add(odd.get(x));
                    x++;
                } else {
                    line.add(even.get(y));
                    y++;
                }
            }
            odd.clear();
            even.clear();
        }
        for (Character c : line)
            stringBuilder.append(c);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(decrypt(encrypt("qwerty", 1), 1));
    }
}
