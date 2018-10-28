import java.util.HashMap;

public class VasyaSeller {
    private static HashMap<String, Integer> moneyInPocket = new HashMap<>(3);

    private static void resetMap() {
        moneyInPocket.put(Integer.toString(25), 0);
        moneyInPocket.put(Integer.toString(50), 0);
        moneyInPocket.put(Integer.toString(100), 0);
    }

    public static String Tickets(int[] peopleInLine)
    {
        //Your code is here...
        resetMap();
        for (int i = 0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] == 25) {
                moneyInPocket.put(Integer.toString(25), moneyInPocket.get(Integer.toString(25)) + 1);
            } else if (peopleInLine[i] == 50) {
                if (moneyInPocket.get(Integer.toString(25)) >= 1) {
                    moneyInPocket.put(Integer.toString(25), moneyInPocket.get(Integer.toString(25)) - 1);
                    moneyInPocket.put(Integer.toString(50), moneyInPocket.get(Integer.toString(50)) + 1);
                } else return "NO";
            } else if (peopleInLine[i] == 100) {
                if (moneyInPocket.get(Integer.toString(50)) >= 1 && moneyInPocket.get(Integer.toString(25)) >= 1) {
                    moneyInPocket.put(Integer.toString(100), moneyInPocket.get(Integer.toString(100)) + 1);
                    moneyInPocket.put(Integer.toString(50), moneyInPocket.get(Integer.toString(50)) - 1);
                    moneyInPocket.put(Integer.toString(25), moneyInPocket.get(Integer.toString(25)) - 1);
                } else if (moneyInPocket.get(Integer.toString(25)) >= 3) {
                    moneyInPocket.put(Integer.toString(100), moneyInPocket.get(Integer.toString(100)) + 1);
                    moneyInPocket.put(Integer.toString(25), moneyInPocket.get(Integer.toString(25)) - 3);
                } else return "NO";
            } else return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(Tickets(new int[] {25, 25, 50} ));
        System.out.println(Tickets(new int[] {25, 100} ));
        System.out.println(Tickets(new int[] {25, 25, 50, 50, 100} ));
    }
}
