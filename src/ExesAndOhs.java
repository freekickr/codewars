/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive.
The string can contain any char.

Examples input/output:
    XO("ooxx") => true
    XO("xooxx") => false
    XO("ooxXm") => true
    XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
    XO("zzoo") => false
 */

//probably mistake in a task. Method must be case insensitive, due to tests
public class ExesAndOhs {

    public static boolean getXO (String str) {
        int xS = 0, oS = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'x')
                xS++;
            else if (c == 'o')
                oS++;
        }
        return oS == xS;
    }

    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
        System.out.println(getXO("ooxxxoxoxoxooxoxxooxbooxCxxxoxoxAoooxxooxxxoxdoxxxooxxoxooo"));
    }
}
