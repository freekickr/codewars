/*
Bit Counting

Write a function that takes an integer as input, and returns the number of bits that are equal
to one in the binary representation of that number. You can guarantee that input is non-negative.

Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case
 */

public class BitCounting {

    public static int countBits(int n){
        // Show me the code!
        return Integer.toBinaryString(n).replaceAll("0","").length();
    }

    public static int countBits2(int n){
        // Show me the code!
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }
}
