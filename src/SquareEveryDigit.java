/*
Welcome. In this kata, you are asked to square every digit of a number.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note:
    The function accepts an integer and returns an integer
 */

public class SquareEveryDigit {

    public static int squareDigits(int n) {
        StringBuilder sb = new StringBuilder();
        for (char c : String.valueOf(n).toCharArray())
            sb.append((int)Math.pow((int)c - '0', 2));
        return Integer.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
}
