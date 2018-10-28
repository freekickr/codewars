/*
Your order, please

Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.

Examples
    "is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
    "4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
    ""  -->  ""
 */

public class YourOrderPlease {

    public static String order(String words) {
        if (words.equals("")) return "";
        String[] resWords = words.split("\\s");
        String[] result = new String[resWords.length];
        for (int i = 0; i < resWords.length; i++) {
            char[] word = resWords[i].toCharArray();
            for (int j = 0; j < word.length; j++) {
                if (word[j] - '0' > 0 && word[j] - '0' <= 9) {
                    result[word[j] - '0' - 1] = resWords[i];
                    break;
                }
            }
        }
        return String.join(" ", result);
    }

    public static String order2(String words) {
        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < arr.length; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}
