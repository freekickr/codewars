/*
for (int i = 0; i + 1 < dirs.size(); i++) {
    if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(dirs.get(i) + dirs.get(i + 1))) {
        dirs.remove(i + 1);
        dirs.remove(i);
        i = -1;
    }
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        // Your code here.
        List<String> directions = new ArrayList<>(Arrays.asList(arr));
        System.out.println(directions);
        int point = opposites(directions);
        while (point != 0) {
            for (int i = 0; i < directions.size() - 1;) {
                if (!checkTwo(directions.get(i), directions.get(i+1))) {
                    directions.remove(i);
                    directions.remove(i);
                    continue;
                }
                i++;
            }
            point = opposites(directions);
        }
        System.out.println(directions);
        return directions.toArray(new String[0]);
    }

    private static boolean checkTwo(String  dirOne, String dirTwo) {
        if ("EAST".equals(dirOne) && !"WEST".equals(dirTwo))
            return true;
        if ("WEST".equals(dirOne) && !"EAST".equals(dirTwo))
            return true;
        if ("SOUTH".equals(dirOne) && !"NORTH".equals(dirTwo))
            return true;
        if ("NORTH".equals(dirOne) && !"SOUTH".equals(dirTwo))
            return true;
        return false;
    }

    private static int opposites(List<String> list) {
        int res = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (!checkTwo(list.get(i), list.get(i+1))) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" });
    }
}
