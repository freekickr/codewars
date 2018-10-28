import java.util.ArrayList;
import java.util.List;

public class Pangram {

    //can be done using regex
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
