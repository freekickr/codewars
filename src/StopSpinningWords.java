/*
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed
(Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.


Examples:
    spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
    spinWords( "This is a test") => returns "This is a test"
    spinWords( "This is another test" )=> returns "This is rehtona test"
 */

public class StopSpinningWords {

    public static String spinWords(String sentence) {
        String[] words = sentence.split("\\s");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() >= 5)
                result.append(new StringBuilder(word).reverse().toString() + " ");
            else
                result.append(word + " ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test"));
        System.out.println(spinWords("This is another test"));
    }
}
