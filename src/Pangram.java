/*
A pangram is a sentence that contains every single letter of the alphabet at least once.
For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
*/

import java.util.ArrayList;
import java.util.List;

public class Pangram {

    private static boolean check(String sentence){
        //code
        List<Character> alphabet = new ArrayList<>(26);
        for (int i = 97; i < 123; i++) alphabet.add((char)i);
        List<Character> listSentence = new ArrayList<>();
        for (Character c : sentence.toLowerCase().toCharArray())
            listSentence.add(c);
        return listSentence.containsAll(alphabet);
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));
        System.out.println(check("Jived fox nymph grabs quick waltz."));
    }
}
